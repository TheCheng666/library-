package com.controller;

import com.entity.Account;
import com.service.LoginAndRegisterService;
import com.utils.CodeUtil;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginAndRegisterController {
    @Autowired
    LoginAndRegisterService loginAndRegisterService;

    /**
     * 生成验证码
     * @param request
     * @param response
     */
    @RequestMapping("/Vcode")
    public void getCode(HttpServletRequest request, HttpServletResponse response){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();

        // 将四位数字的验证码保存到Session中。
        HttpSession session =request.getSession();
        session.setAttribute("code", codeMap.get("code").toString());

        // 禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", -1);
        response.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos;
        try {
            sos = response.getOutputStream();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
            sos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 判断账户是否存在
     * @param account
     * @return
     */
    @RequestMapping("/checkregister")
    @ResponseBody
    public Msg checkRegister(String account){
        String regx="(^[a-zA-Z0-9]{5,20}$)|(^[\\u2E80-\\u9FFF]{2,5})";
        if(!account.matches(regx)){
            return Msg.fail().add("re_msg","用户名必须是5-20位数字或2-5位中文");
        }
        boolean result=loginAndRegisterService.checkRegister(account);
        if (result){
            return Msg.fail().add("re_msg","账户已经存在");
        }else {
            return Msg.success().add("re_msg","此账户可用");
        }
    }


    /**
     * 用户注册
     * @param account
     * @param result
     * @return
     */
    @RequestMapping("/register")
    @ResponseBody
    public Msg register(@Valid Account account, BindingResult result){
        if (result.hasErrors()){
            //校验失败
            Map<String,Object> map=new HashMap<>();
            List<FieldError> errors=result.getFieldErrors();
            for (FieldError error:errors){
                map.put(error.getField(),error.getDefaultMessage());
            }
            return Msg.fail().add("err",map);
        }else {
            boolean count=loginAndRegisterService.saveAccount(account);
            if (count){
                return Msg.success();
            }else {
                return Msg.fail();
            }
        }
    }


    /**
     * 登陆
     * @param account
     * @param inputCode  页面输入的验证码
     * @param request
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Msg login(Account account,String inputCode,HttpServletRequest request){
        if (request.getSession().getAttribute("code").equals(inputCode)){
            boolean result=loginAndRegisterService.checkAccount(account);
            if (result){
                Account completeAccount=loginAndRegisterService.getAccount(account);
                request.getSession().setAttribute("accountinfo",completeAccount);
                return Msg.success();
            }else {
                return Msg.fail().add("err_msg","账号或密码或身份错误");
            }
        }else return Msg.fail().add("err_msg","验证码错误");
    }

    /**
     * Account登出，需要跳到登陆页面
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    @ResponseBody
    public Msg logout(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.invalidate();
        return Msg.success().add("logout_msg","用户已登出");
    }

}
