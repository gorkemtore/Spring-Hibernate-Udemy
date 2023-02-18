package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//check if are there same?
		boolean result = (alphaCoach == theCoach);
		// print out the results
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemory location for theChoach : "+theCoach);
		System.out.println("\nMemory location for alphaCoach : "+alphaCoach);
		
		
		//close
		context.close();
	}

}
