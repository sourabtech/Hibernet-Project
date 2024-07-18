package com.anudip;

import org.springframework.stereotype.Component;

@Component("axis")
public class AxisBank implements Client {

	String empType= " accountant";
	
	
	public AxisBank(String empType) {
		super();
		this.empType = empType;
	}


	public AxisBank() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void project() {
		System.out.println("The employee working for Axis Bank as " + empType + " of Project");
	}

	
}
