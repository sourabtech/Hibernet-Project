package com.anudip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("employee.xml");
        // Painter p= (Painter) context.getBean("Sourabh");
        // p.perform();
    	
      
    	Employee e =(Employee) context.getBean("sagar");
    	e.work();
    }
}
