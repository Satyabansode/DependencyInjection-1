package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(DependencyInjection1Application.class, args);
		Person person = con.getBean(Person.class);
		person.eat();

//		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
//		Person person=con.getBean(Person.class);
//		person.eat();
	}
}