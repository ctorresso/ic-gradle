package com.dbg.ic.gradle.test.service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.dbg.ic.gradle.exceptions.NotFoundException;
import com.dbg.ic.gradle.service.HelloWorldService;
import com.dbg.ic.gradle.service.HelloWorldServiceImpl;

public class TestHelloWorldService {

	private static final HelloWorldService service = new HelloWorldServiceImpl();

	@Test
	public void testListByLanguage() throws NotFoundException {
		Assert.assertEquals(service.listByLanguage("es").getText(), "Hola mundo!");
		Assert.assertEquals(service.listByLanguage("es").getLanguage(), "es");
	}

	@Test(expected = NotFoundException.class)
	public void exception() throws NotFoundException {
		service.listByLanguage("afgg");
	}

	@Test
	public void testListAll() {
		Assert.assertThat(service.listAll(), CoreMatchers.notNullValue());
	}

}
