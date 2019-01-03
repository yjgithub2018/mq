package com.example;

import com.example.testMq.HelloSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
public class DemoApplication {
//	@Bean
//	public HelloSender springHelloSender() {
//		return new HelloSender();
//	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
