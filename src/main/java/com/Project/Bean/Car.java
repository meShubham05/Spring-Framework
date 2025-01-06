package com.Project.Bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private int carId;
	private String carName;
	private int price;
	
	public Car()
	{
		System.out.println("Car :: Constructor : ");
	}
	
}
