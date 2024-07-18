package com.springdemo;

import org.springframework.stereotype.Component;

@Component("sakshi")                              //been creat kela
public class Dancer implements Performer {        // performer impliment kela

	
	@Override
	public void perform() {                        //dancer chi add unimpliment method add keli
		System.out.println("Dancer is dancing on song chintata chita chita ");
	}

}
