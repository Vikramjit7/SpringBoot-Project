/*package com.example.demo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean2.Employee;
import com.example.demo.service2.EmpService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpServiceTest {

	  @Autowired
	  private EmpService myService;
	  
	  //Integration Testing : DB getting called, No mock response
	  @Test 
	  public void testGetRecordById() {
	    String expectedResult = "Gurgaon";
	    String result = myService.getrecordbyID(4).getAddress();
	    assertEquals(expectedResult, result);
	  }
	  
	  @Test
	  public void testAddRecord1() {
		  String actual = myService.addrecord(new Employee(5, "emp5", "Chennai")).getAddress();
		  String expected = "Chennai";
		  assertEquals(actual, expected) ;
	  }	
	  
	  @Test
	  public void testUpdateRecord() {
		  String actual = myService.updaterecordbyID(new Employee(4, "emp4", "Indore"), 4).getAddress();
		  String expected = "Indore";
		  assertEquals(actual, expected) ;
	  }	
	 
}*/
