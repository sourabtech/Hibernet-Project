package com.springdemo;

import org.springframework.stereotype.Component;

@Component("squ")                               // ref show kela
public class Square implements Shape {

	String shadow;                       //refrence create kela shadow
	
	public Square() {                   // deafault constructor add kela
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(String shadow) {                  //parameterise constructor add kela
		super();
		this.shadow = shadow;
	}

	@Override
	public void draw() {                   // square chi add unimpliment method add keli syso write keli
		System.out.println("Drawing a Square shadow is " + shadow + " color.");
	}
	

}
