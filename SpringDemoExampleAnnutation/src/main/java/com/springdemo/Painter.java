package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//There are two way to inject the object
//1) constructor 
//2) setter

@Component("tejas")   // been(id)  creat kela
public class Painter implements Performer {
	
	@Autowired
	@Qualifier("tri")                                // ref create kela . ha ref kote takayache to tr traingle made yacha been creat kela
	Shape shape;                                     // reference verible tayar kelaa
	
	
		public Painter() {                           //superclass  constructor create kela 
		super();
		// TODO Auto-generated constructor stub
	}

		public Painter(Shape shape) {                // parameterise constructor create kela
		super();
		this.shape = shape;
	}

		@Override
		public void perform() {                       //unimppliment method add keli
			shape.draw();
			
		}



}
