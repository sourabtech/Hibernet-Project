package com.anudip;

import org.springframework.stereotype.Component;

@Component("samadhan")
public class Developer implements Employee  {
	
	
	String dev="code";
	
	public Developer(String dev) {
		super();
		this.dev = dev;
	}
	

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void work() {
		System.out.println("developer develped the " + dev + " in ther program.");
	}

}
