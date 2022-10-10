package com.technoelevate.springcorepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *creating bean using spring by give information using xml based
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      User bean = context.getBean("user",User.class);
      bean.getSocialMedia().useApp();
      System.out.println(bean);
      
      
      ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
      User bean2 = context1.getBean("user2",User.class);
      bean2.getSocialMedia().useApp();
      System.out.println(bean2);
    }
}
