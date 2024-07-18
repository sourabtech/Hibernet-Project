package com.anudip;

import org.springframework.stereotype.Component;

@Component("sagar")
public class Tester  implements Employee{

	@Override
	public void work() {
		System.out.println("test the code");
	}

}
