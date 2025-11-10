package com.springframework.spring6di;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

	private static final Logger log=LoggerFactory.getLogger(Spring6DiApplicationTests.class);

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void textGetController(){
		System.out.println(myController.sayHello());

		log.info(myController.sayHello());
	}

	@Test
	void testAutowireOfControllerFromCtx(){
		MyController myController=applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
		log.info(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
