package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Laptop;


public class LaptopChargerMainClass {
	public static void main(String[] args) {
		
		//Create a Spring Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("laptop-charger1.xml");
		
		//hey container give me a bean for Laptop class
		
		Laptop lp=(Laptop) applicationContext.getBean("laptop");
		System.out.println(lp);
		System.out.println("------------------");
		
		
		//hey container give me a bean for Charger class
		
		//Charger ch=(Charger) applicationContext.getBean("charger2");
		//System.out.println(ch);
		
		
	}
}
