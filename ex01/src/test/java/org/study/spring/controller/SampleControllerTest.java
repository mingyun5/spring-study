package org.study.spring.controller;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Inject
	WebApplicationContext wac;
	MockMvc mvc;
	@Before
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
		logger.info("setUp called...");
	}
	
	@Test
	public void testProduct() {
	//	mvc.perform(MockMvcRequestBuilders.get("/product"));
	}
	
	@After
	public void cleanUp() {
		logger.info("cleanUp called...");
	}
}
