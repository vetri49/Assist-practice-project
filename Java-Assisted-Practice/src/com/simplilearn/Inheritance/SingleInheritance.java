package com.simplilearn.Inheritance;

//Single level inheritance
public class SingleInheritance {

	public static void main(String[] args) {
		
		Vechicle Pulsar=new Bike("NS 150",2023,150000.00,"Bajaj");
		Vechicle Mahindra=new Car("Bolero",2021,600000.00,"Mahindra");
		System.out.println(Pulsar);
		System.out.println("-----------------------");
		System.out.println(Mahindra);
		

	}

}
//super class
class Vechicle{
	String name;
	long model;
	double price;
	String brand;
	
	public Vechicle(String name, long model, double price, String brand) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	public void describe() {
		System.out.println("This is a "+name+" .model= "+model+", price= "+price+" ,brand= "+brand);
	}
	

}
//sub class
class Car extends Vechicle{
	int noOfWheels;
	int numofDoors;
	public Car(String name, long model, double price, String brand) {
		super(name, model, price, brand);
		this.noOfWheels = 4;
		this.numofDoors = 4;
	}
	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", numofDoors=" + numofDoors + ", name=" + name + ", model=" + model
				+ ", price=" + price + ", brand=" + brand + "]";
	}
	


	
}
//sub class
class Bike extends Vechicle{
	int numOfWheels;
	

	public Bike(String name, long model, double price, String brand) {
		super(name, model, price, brand);
		this.numOfWheels=2;
	}


	@Override
	public String toString() {
		return "Bike [numOfWheels=" + numOfWheels + ", name=" + name + ", model=" + model + ", price=" + price
				+ ", brand=" + brand + "]";
	}


	
	
	
}
