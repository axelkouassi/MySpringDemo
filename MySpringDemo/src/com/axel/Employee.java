package com.axel;


//POJO / Bean Model
public class Employee {
	
	//Attributes
	int eid;
	String name;
	int salary;
	String dept;
	String email;
	
	public Employee() {
		System.out.println("--Employee Object Constructed--");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", email=" + email + "]"
				+ "\n Object Address: " + super.toString(); 
	}
	
	
	
	

}
