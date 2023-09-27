package com.example.demo.controller2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean2.Employee;
import com.example.demo.exception2.BusinessException;
import com.example.demo.exception2.ControllerException;
import com.example.demo.repository2.Reposit;
import com.example.demo.service2.EmpService;

@RestController
public class HomeController {
	
	@Autowired
	EmpService serv;
	
	@GetMapping("/")
	public String get() {
		return "Welcome To The SpringBoot Demo!";
	}
	
	@PostMapping("/emp")
	public ResponseEntity<?> addrecord(@RequestBody Employee emp){
		try {
			Employee saveemp1 = serv.addrecord(emp);
			return new ResponseEntity<Employee>(saveemp1, HttpStatus.CREATED);
		} catch (BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrormessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			throw new ControllerException("Exception occured in Controller Layer.");
		}
	}
	
	@GetMapping("/emp")
	public List<Employee> getrecord() {
		List<Employee> saveemp2 = serv.getrecord();
		return saveemp2;
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getrecordbyID(@PathVariable Integer id) {
		try {
			Employee saveemp3 = serv.getrecordbyID(id);
			return new ResponseEntity<Employee>(saveemp3, HttpStatus.FOUND);
		} catch (BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrormessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.NOT_FOUND);
		}
	}	
	
	@DeleteMapping("/emp/{id}")
	public String deletebyID(@PathVariable Integer id) {
		String saveemp4 = serv.deleterecordbyID(id);
		return saveemp4;
	}
	
	@PutMapping("/emp/{id}")
	public ResponseEntity<?> updaterecordbyID(@RequestBody Employee emp, @PathVariable Integer id) {
		try {
		Employee saveemp5 = serv.updaterecordbyID(emp, id);
		return new ResponseEntity<Employee>(saveemp5, HttpStatus.OK);
		} catch(BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrormessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.NOT_FOUND);
		}
	}
}
