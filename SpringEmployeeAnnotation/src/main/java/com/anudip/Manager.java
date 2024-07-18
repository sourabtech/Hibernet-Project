package com.anudip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sourabh")
public class Manager implements Employee {

	@Autowired
	@Qualifier("axis")
	Client cl;
	
	public Manager(String sam) {
		super();
		this.cl =cl;
	}


	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void work() {
		cl.project();
	}




	

}
