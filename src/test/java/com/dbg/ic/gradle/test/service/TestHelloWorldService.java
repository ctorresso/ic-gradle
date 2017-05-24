package com.dbg.ic.gradle.test.service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.dbg.ic.gradle.exceptions.NotFoundException;
import com.dbg.ic.gradle.service.HelloWorldService;
import com.dbg.ic.gradle.service.HelloWorldServiceImpl;

public class TestHelloWorldService {

	private static final HelloWorldService service = new HelloWorldServiceImpl();

	@Test
	@Ignore
	public void testListByLanguage() throws NotFoundException {
		// calidad?
		Assert.assertEquals(service.listByLanguage("es").getText(), "Hola mundo!");
	}

	@Test
	@Ignore
	public void testListAll() {
		Assert.assertThat(service.listAll(), CoreMatchers.notNullValue());
	}

}
