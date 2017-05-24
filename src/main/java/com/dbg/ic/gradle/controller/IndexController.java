package com.dbg.ic.gradle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.ic.gradle.dto.HelloWorldDTO;

@RestController
@RequestMapping(value = "/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public HelloWorldDTO index() {
		return new HelloWorldDTO("es", "Hola mundo!");
	}

}
