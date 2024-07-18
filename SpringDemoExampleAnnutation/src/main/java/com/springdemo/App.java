package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 IOC container (dependancy injection that is two ways 1)constructor way 2)setter way)
  
  
  interface BeanFactory

{
	
}
interface ApplicationContext extends BeanFactory
{
	
}
class ClassPathXmlApplicationContext implements ApplicationContext
{
	
}
 */

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("shape.xml");
      // Painter p= (Painter) context.getBean("Sourabh");
      // p.perform();
       
       Performer p=(Performer) context.getBean("tejas");
       p.perform();
       
    }
}
