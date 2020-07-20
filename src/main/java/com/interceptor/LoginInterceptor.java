package com.interceptor;

import com.exception.LoginException;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 登陆拦截器
     * 在执行controller方法之前进行拦截。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri=request.getRequestURI();
        System.out.println(uri);
        if (uri.indexOf("login")>=0||uri.indexOf("register")>=0||uri.indexOf("checkregister")>=0||uri.indexOf("Vcode")>=0){
            if (request.getSession().getAttribute("LoginException")!=null){
                request.getSession().removeAttribute("LoginException");
            }
            return true;
        }else {
            HttpSession session=request.getSession();
            if (session.getAttribute("accountinfo")!=null){
                return true;
            }else {
                throw new LoginException("用户未登录！");
            }
        }
    }

   //执行controller方法后，在ModelAndView对象之前，统一处理数据和试图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //在页面加载后，该方法执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
