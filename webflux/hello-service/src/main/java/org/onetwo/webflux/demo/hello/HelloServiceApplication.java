package org.onetwo.webflux.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}
	
}
