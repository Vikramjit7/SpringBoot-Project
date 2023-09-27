/*package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatusCode;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean2.Employee;
import com.example.demo.controller2.HomeController;
import com.example.demo.exception2.ControllerException;
import com.example.demo.service2.EmpService;

@RunWith(SpringRunner.class)
@SpringBootTest
class HomeControllerTest {	  
		
	@Autowired
	private HomeController myController;

	@Autowired
	private Employee emp;
	  
	@Test
	public void testaddrecord() throws ControllerException {;
	   String expectedResult = "201";
	   String result = myController.addrecord(emp).getStatusCode().toString();
	   assertEquals(expectedResult, result);
	  }

}*/
