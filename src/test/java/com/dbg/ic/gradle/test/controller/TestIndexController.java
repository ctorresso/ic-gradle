package com.dbg.ic.gradle.test.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dbg.ic.gradle.controller.IndexController;
import com.dbg.ic.gradle.service.HelloWorldService;

@RunWith(MockitoJUnitRunner.class)
public class TestIndexController {

	@Mock
	private HelloWorldService helloWorldService;

	@InjectMocks
	private IndexController indexController;

	@Test
	@Ignore
	public void testIndexAll() {
		// Mockito.when(helloWorldService.listAll()).thenReturn(Arrays.asList(new
		// HelloWorldDTO("es", "Hola mundo!")));
		// final List<HelloWorldDTO> l = indexController.index();
		// Assert.assertTrue(l instanceof List);
		// Assert.assertEquals(l.get(0).getLanguage(), "es");
		// Assert.assertEquals(l.get(0).getText(), "Hola mundo!");
	}

	@Test
	@Ignore
	public void testFindByLanguage() {
		// Mockito.when(helloWorldService.listByLanguage("es")).thenReturn(new
		// HelloWorldDTO("es", "Hola mundo!"));
		// Assert.assertEquals(indexController.list("es").getText(), "Hola
		// mundo!");
	}

}
