package com.dbg.ic.gradle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dbg.ic.gradle.exceptions.NotFoundException;

@ControllerAdvice(basePackages = { "com.at.library.controller" })
public class ControllerFails {

	@ResponseBody
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void error(Exception e) {
	}

}