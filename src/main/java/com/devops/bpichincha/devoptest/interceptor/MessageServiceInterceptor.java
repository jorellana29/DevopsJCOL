package com.devops.bpichincha.devoptest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.devops.bpichincha.devoptest.exceptions.InvalidMethodRequest;

@Component
public class MessageServiceInterceptor implements HandlerInterceptor {
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {
      
       System.out.println("Pre Handle method is Calling");
       String a = request.getMethod();
	   System.out.println("==========================================  " + a);
	   System.out.println("Post Handle method is Calling");
	   if(!a.equalsIgnoreCase("POST")) {
		   throw new InvalidMethodRequest("ERROR");
	   }
	   return true;
   }
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
      Object handler, ModelAndView modelAndView) throws Exception {
	   String a = request.getMethod();
	   System.out.println("==========================================  " + a);
	   System.out.println("Post Handle method is Calling");
	   
   }
   @Override
   public void afterCompletion
      (HttpServletRequest request, HttpServletResponse response, Object 
      handler, Exception exception) throws Exception {
      
      System.out.println("Request and Response is completed");
   }
}

