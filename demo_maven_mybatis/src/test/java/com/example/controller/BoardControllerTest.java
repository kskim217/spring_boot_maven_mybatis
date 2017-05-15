package com.example.controller;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BoardControllerTest {
	private static final String PRODUCT_API_URI = "http://localhost:8080/";
	private MockMvc mockMvc = null;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void before() throws Exception {
		mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@After
	public void after() throws Exception {
		mockMvc = null;
	}

	@Test
	public void testBoardList() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(PRODUCT_API_URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
	}
}
