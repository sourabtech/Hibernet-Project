package com.springdemo;

import org.springframework.stereotype.Component;

// component that allows to annotation that allows Spring to detect our custom beans automatically
// <bean id="tri" class="com.anudip.springdemo.Triangle"></been>

@Component("tri")          
public class Triangle implements Shape {

	String color = "green";
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Painter is drawing " + color + " Color triangle");
		
	}
	

}
