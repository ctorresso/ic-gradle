package com.dbg.ic.gradle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dbg.ic.gradle.dto.ApiErrorDTO;
import com.dbg.ic.gradle.exceptions.NotFoundException;

@ControllerAdvice(basePackages = { "com.dbg.ic.gradle.controller" })
public class ControllerFails {

	@ResponseBody
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiErrorDTO error(Exception e) {
		return new ApiErrorDTO(e.getMessage());
	}

}