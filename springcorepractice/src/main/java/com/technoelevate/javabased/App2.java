package com.technoelevate.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext context2 = new AnnotationConfigApplicationContext(MobileConfiguration.class);
		Mobile bean2 = context2.getBean("mobile2", Mobile.class);
		System.out.println(bean2);
	}
}
