package com.example.demo.bean2;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id 
	@Generated(value = { "1" })
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "location")
	private String address;
	
	public Employee() {}
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + ", id=" + id + "]";
	}

	public void display() {
		System.out.println("Employee bean method is accessible.");
		//address.addre();
	}
}
