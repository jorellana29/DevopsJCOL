package com.devops.bpichincha.devoptest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.devops.bpichincha.devoptest.exceptions.InvalidMethodRequest;
import com.google.common.base.Strings;

@Component
public class MessageServiceInterceptor implements HandlerInterceptor {
	
    @Value("${header.name}")
	   private String HEADER;
    @Value("${header.apiKey}")
	   private String SECRET;
    
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {
      
	   String HeaderSecret = request.getHeader(HEADER);	   
	   if(!Strings.isNullOrEmpty(HeaderSecret)) {
		   if(!HeaderSecret.equals(SECRET)) {
			   
			   response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			   throw new InvalidMethodRequest("No autorizado!!");
		   }		   
	   }else {
		   throw new InvalidMethodRequest("Valor cabecera no existente, valor esperado: " + HEADER);
	   }
       System.out.println("Validando Method Post!!");
       String method = request.getMethod();
	   if(!method.equalsIgnoreCase("POST")) {
		   throw new InvalidMethodRequest("ERROR");
	   }
	   
	   return true;
   }
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
      Object handler, ModelAndView modelAndView) throws Exception {
	   String a = request.getMethod();
	   System.out.println("==========================================   " + a);
	   System.out.println("Post Handle method is Calling");
	   
   }
   @Override
   public void afterCompletion
      (HttpServletRequest request, HttpServletResponse response, Object 
      handler, Exception exception) throws Exception {
      
      System.out.println("Request and Response is completed");
   }
}

