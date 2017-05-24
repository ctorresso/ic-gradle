package com.dbg.ic.gradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.ic.gradle.dto.HelloWorldDTO;
import com.dbg.ic.gradle.service.HelloWorldService;

@RestController
@RequestMapping(value = "/")
public class IndexController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping(method = RequestMethod.GET)
	public List<HelloWorldDTO> index() {
		return helloWorldService.listAll();
	}

}
