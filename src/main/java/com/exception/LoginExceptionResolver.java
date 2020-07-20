package com.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginExceptionResolver implements HandlerExceptionResolver {
    /**
     * Try to resolve the given exception that got thrown during handler execution,
     * returning a {@link ModelAndView} that represents a specific error page if appropriate.
     * <p>The returned {@code ModelAndView} may be {@linkplain ModelAndView#isEmpty() empty}
     * to indicate that the exception has been resolved successfully but that no view
     * should be rendered, for instance by setting a status code.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  the executed handler, or {@code null} if none chosen at the
     *                 time of the exception (for example, if multipart resolution failed)
     * @param ex       the exception that got thrown during handler execution
     * @return a corresponding {@code ModelAndView} to forward to, or {@code null}
     * for default processing
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        LoginException e=null;
        if (ex instanceof LoginException){
            e=(LoginException)ex;
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("redirect:/exception.jsp");
            request.getSession().setAttribute("LoginException",e.getMsg());
            return modelAndView;
        }else {
            e=new LoginException("非登录错误！");
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("redirect:/error.jsp");
            request.getSession().setAttribute("OtherException",e.getMsg());
            return modelAndView;
        }
    }
}
