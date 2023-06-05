package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Food food;

	public void speak() {
		System.out.println("I can Speak");
	}

	public void eat() {
		food.recipes();
	}
}
