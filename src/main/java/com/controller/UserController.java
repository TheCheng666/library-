package com.controller;

import com.entity.Account;
import com.entity.Book;
import com.entity.BrrowInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.UserService;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    /**http://localhost:8080/User/brrowBook
     * book对象: book_id 和 bookNum
     * BrrowInfo对象： bookid lendtime applytime（申请借书时间）
     * 借书
     * @param book
     * @param brrowInfo
     * @return
     */
    @RequestMapping("/brrowBook")
    @ResponseBody
    public Msg brrowBook(Book book, BrrowInfo brrowInfo, HttpServletRequest request){
        //更新书本的数量
        book.setBookNumber(book.getBookNumber()-1);
        boolean result=userService.updateBookNum(book);
        if (result){
            //获取用户信息
            Account account =(Account) request.getSession().getAttribute("accountinfo");
            Integer id=account.getId();
            //生成借书单
            brrowInfo.setLendtime(new Date());
            brrowInfo.setUserid(id);
            Boolean result_Bro=userService.insertBrrowInfo(brrowInfo);
            if (result_Bro){
                return Msg.success();
            }else {
                return Msg.fail().add("err_msg","添加失败!");
            }
        }else {
            book.setBookNumber(book.getBookNumber()+1);
            return Msg.fail().add("err_msg","该书数量不足！");
        }
    }

    /**
     * localhost:8080/User/getBrrowInfo
     * 用户查看自己的借书订单
     * @param session
     * @return
     */
    @RequestMapping("/getBrrowInfo")
    @ResponseBody
    public Msg getBrrowInfo(HttpSession session){
        Account account=(Account)session.getAttribute("accountinfo");
        List<BrrowInfo> brrowInfo=userService.getBrrowInfo(account.getId());
        if (!brrowInfo.isEmpty()){
            return Msg.success().add("brrowInfo",brrowInfo);
        }else {
            return Msg.fail().add("err_msg","你没有借书单！");
        }
    }

    /**
     * http://localhost:8080/User/returnBook
     * 传入broid
     * 更还书时间 返回详细brrowinfo
     * 页面做一个returntime-lendtime获得day的计算
     * 大于applytime 则 需要付钱 付钱后发送
     * @param brrowInfo
     * @return
     */
    @RequestMapping("/returnBook")
    @ResponseBody
    public Msg returnBook(BrrowInfo brrowInfo){
        //更新brrowinfo表中的returntime
        brrowInfo.setReturntime(new Date());
        boolean result_update=userService.updateBrrowInfo(brrowInfo);
        if (result_update){
            //查询借书单详情
            BrrowInfo infobyBroId=userService.getBrrowInfobyBroId(brrowInfo.getBroId());
            return Msg.success().add("brrowinfoByBroId",infobyBroId);
        }else {
            return Msg.fail();
        }
    }

    /**
     * http://localhost:8080/User/submitBrrow
     * bookId bookNumber broId status
     * 交钱之后设置status为1 发送该请求
     * @param book
     * @param brrowInfo
     * @return
     */
    @RequestMapping("/submitBrrow")
    @ResponseBody
    public Msg submitBrrow(Book book, BrrowInfo brrowInfo){
        if (brrowInfo.getStatus()>0){
            //提交订单
            boolean resule=userService.updateBrrowInfo(brrowInfo);
            if(resule){
                book.setBookNumber(book.getBookNumber()+1);
                //增加图书的数量
                boolean resule_book=userService.updateBookNum(book);
                if (resule_book){
                    return Msg.success();
                }else {
                    return Msg.fail();
                }
            }else {
                return Msg.fail();
            }
        }else {
            return Msg.fail().add("err_msg","订单提交失败");
        }
    }
}
