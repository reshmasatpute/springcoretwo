/*
 *create bean using constructor.
 */


package com.technoelevate.springcorepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		User bean = context.getBean("constructor",User.class);
		System.out.println(bean);
	}
}
