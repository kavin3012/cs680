package edu.umb.cs680.hw04;

public class Car {

	private String model, make;
	private int mileage, year;
	public Car(String make, String model, int year, int mileage, float price)
	{
		this.year = year;
		this.model = model;
		this.make = make;
		this.mileage = mileage;
	}

	public Car(String make, String model, int year) {
		this.year = year;
		this.model = model;
		this.make = make;
    }

	public String getModel()
	{
		return this.model;
	}
	public String getMake()
	{
		return this.make;
	}	

	public int getYear()
	{
		return this.year;
	}
	public int getMileage()
	{
		return this.mileage;
	}
}