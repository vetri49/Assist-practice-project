package com.simplilearn.accessmodifier;

public class DefaultAccessModifier {

	public static void main(String[] args) {
        FarmHouse farmHouse = new FarmHouse();
		
		System.out.println("Title : " + farmHouse.title);
		System.out.println("Price : " + farmHouse.price);
		
		farmHouse.showDetails();
		farmHouse.showPrice();

	}

}

class FarmHouse {
	
	String title = "Open Green Farm";
	int chairCount = 170;
	byte games = 21;
	float price = 4184.96f;
	
	void showDetails() {
		System.out.println(this.title + " has chair count : "+this.chairCount + " and per day price is : $"+this.price );
	}
	
	void showPrice() {
		System.out.println(this.title + " per day price is : $"+this.price );
	}
	
	FarmHouse() {} // default constructor : A constructor without any arguments or with the default value for every argument
	
}
