package com.luuv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean form spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call methods on bean 
		System.out.println(theCoach.getDailyWorkout());
		//close context
		context.close();
	}

}
