package edu.umb.cs680.hw14;

import java.util.LinkedList;

public class Car 
{
	 
			private String ready, type;
			private int mileage, year;
			private float cost;
			private int dominationCount;

			public Car(String make, String model, int year, int mileage, float price) {
				this.ready = ready;
				this.type = type;
				this.year = year;
				this.mileage = mileage;
				this.cost = price;
			}

			public String getMake() {
				return ready;
			}

			public String getModel() {
				return type;
			}

			public int getMileage() {
				return mileage;
			}

			public int getYear() {
				return year;
			}

			public float getPrice() {
				return cost;
			}
			
			public void setDominationCount(LinkedList<Car> usedCars) {
				for (Car car : usedCars) {
					if ((car.getPrice() >= this.getPrice()) && (car.getMileage() >= this.getMileage())
							&& (car.getYear() <= this.getYear())) {
						this.dominationCount = dominationCount+1;
				    }	
				}
			}

			public int getDominationCount() {
				return dominationCount;
			}

}
