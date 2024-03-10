package com.vivek.ExceptionHandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vivek.Service.DemoService;



@ControllerAdvice
public class ExceptionHandle {
	Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
	
	@ExceptionHandler(Exception.class)
	public String handleEx(Exception ex) {
		logger.error(ex.getMessage());
		return "errormsg";
	}

}
