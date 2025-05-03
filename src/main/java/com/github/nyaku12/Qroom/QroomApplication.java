package com.github.nyaku12.Qroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class QroomApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(QroomApplication.class, args);


	}
	@EventListener(ApplicationReadyEvent.class)
	public void onReady(ApplicationReadyEvent event){
		System.out.println("Ready! Time taken: " + event.getTimeTaken().toMillis());
	}

}
