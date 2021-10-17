package com.Robert.models;

public class Employee extends Person {
	
	private String employeeUserName;
	private String employeePassWord;
	private boolean employeeLoginInfoCheck;
	
	
	
	public String getEmployeeUserName() {
		return this.employeeUserName;
	}
	
	public void setEmployeeUserName;(String employeeUserName;) {
		
		this.employeeUserName; = employeeUserName;
		
	}
	public String getEmployeePassWord() {
		return this.employeePassWord;
	}
	
	public void setEmployeePassWord(String employeePassWord) {
		
		this.employeePassWord = employeePassWord;
		
	}
	
	public void employeeLogin() {
		if(employeeUserName == employeeUserName && employeePassWord == employeePassWord) {
			loginInfoCheck = true;
		}
	}

}
