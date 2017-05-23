package com.dbg.ic.gradle.test.controller;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbg.ic.gradle.controller.IndexController;
import com.dbg.ic.gradle.dto.HelloWorldDTO;
import com.dbg.ic.gradle.service.HelloWorldService;

@RunWith(MockitoJUnitRunner.class)
public class TestIndexController {

	@Mock
	private HelloWorldService helloWorldService;

	@InjectMocks
	private IndexController indexController;

	@Test
	public void testIndexAll() {
		Mockito.when(helloWorldService.listAll()).thenReturn(Arrays.asList(new HelloWorldDTO("es", "Hola mundo!")));
		final List<HelloWorldDTO> l = indexController.index();
		Assert.assertTrue(l instanceof List);
		Assert.assertEquals(l.get(0).getLanguage(), "es");
		Assert.assertEquals(l.get(0).getText(), "Hola mundo!");
	}

	@Test
	public void testFindByLanguage() {
		Mockito.when(helloWorldService.listByLanguage("es")).thenReturn(new HelloWorldDTO("es", "Hola mundo!"));
		Assert.assertEquals(indexController.list("es"), "Hola mundo!");
	}

}
