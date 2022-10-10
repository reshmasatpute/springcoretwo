package com.technoelevate.javabased;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfiguration {

	@Bean(autowire = Autowire.BY_TYPE)
	public Mobile getMobile() {
		Mobile mobile = new Mobile();
		mobile.setBrand("Xiomii");
		mobile.setColor("gray");
		mobile.setModel("Redmi note-11_5G");
		mobile.setPrize(24000);
		
		Camera camera = new Camera();
		camera.setLens("50mm");
		camera.setClarity("HD");
		camera.setPixels("50mpixel");
		mobile.setCamera(camera);
		return mobile;	
	}
	
	@Bean(name = "mobile2")
	public Mobile getObject() {
		Mobile mobile = new Mobile();
		mobile.setBrand("samsung");
		mobile.setColor("Royal blue");
		mobile.setModel("sm-19");
		mobile.setPrize(18000);
		
		Camera camera = new Camera();
		camera.setLens("20mm");
		camera.setClarity("triple Ai camera");
		camera.setPixels("30mpixel");
		mobile.setCamera(camera);
		return mobile;	
	}
}
