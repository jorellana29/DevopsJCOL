package com.devops.bpichincha.devoptest.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class HandlerExecption {

	@ExceptionHandler
	public String handleMethodException(InvalidMethodRequest exception) {
		return exception.getMessage();
	}
}
