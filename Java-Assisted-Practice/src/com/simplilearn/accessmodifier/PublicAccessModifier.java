package com.simplilearn.accessmodifier;

public class PublicAccessModifier {

	public static void main(String[] args) {
			        Park park = new Park();
					
					System.out.println(park.title);
					System.out.println(park.statuesCount);
					
					System.out.println("---------------");
					
					park.showDetails();
					park.showStatues();

	}

}

class Park {
	
	//public data members
	public String title = "Public Entertainment Park";
	public int chairCount = 200;
	public short statuesCount = 16;
	public byte games = 13;
	
	// public methods 
	public void showDetails() {
		System.out.println(this.title + " has chair count : "+ this.chairCount +" and statues are : "+this.statuesCount);
	}
	public void showStatues() {
		System.out.println(this.title + " has total "+this.statuesCount +" statues.");
	}
	
	
}