package com.dbg.ic.gradle.service;

import java.util.List;

import com.dbg.ic.gradle.dto.HelloWorldDTO;
import com.dbg.ic.gradle.exceptions.NotFoundException;

public interface HelloWorldService {

	public List<HelloWorldDTO> listAll();

	public HelloWorldDTO listByLanguage(String language) throws NotFoundException;

}
