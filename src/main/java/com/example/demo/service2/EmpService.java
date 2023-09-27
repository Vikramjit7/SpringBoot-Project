package com.example.demo.service2;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.bean2.Employee;
import com.example.demo.exception2.BusinessException;
import com.example.demo.repository2.Reposit;

@Service
public class EmpService {
	
	@Autowired
	Reposit rep;

	public Employee addrecord(Employee emp){
		
		if (emp.getName().isEmpty() || emp.getName().length() == 0) {
			throw new BusinessException("Employee Name is Blank!");
		}try{
			return rep.save(emp);
		}catch(IllegalArgumentException e) {
			throw new BusinessException("Invalid record provided!");
		}catch(Exception e) {
			throw new BusinessException("Exception occured in Service Layer!");
		}
	}
	
	public List<Employee> getrecord() {
		return rep.findAll();
	}
	
	public Employee getrecordbyID(Integer id) {
		Optional<Employee> getempbyID = rep.findById(id);
		if (getempbyID.isPresent()) {
			System.out.println("The name & address of record "+id+" is : "+getempbyID.get().getName()+", "+getempbyID.get().getAddress());
			return getempbyID.get();
		}else {
			throw new BusinessException("Employee with ID : "+id+" is not present.");
		}
	}
	
	public Employee updaterecordbyID(Employee emp, Integer id) {
		Optional<Employee> newemp2 = rep.findById(id);
		if (newemp2.isPresent()) {
			Employee newemp3 = newemp2.get();
			newemp3.setAddress(emp.getAddress());
			newemp3.setName(emp.getName());
			return rep.save(newemp3);
		} else {
			throw new BusinessException("Employee with ID : "+id+" is not present.");
		}
	}
	
	public String deleterecordbyID(Integer id) {
		rep.deleteById(id);
		return "Record ID :" + id + " has been deleted!";
	}	
}
