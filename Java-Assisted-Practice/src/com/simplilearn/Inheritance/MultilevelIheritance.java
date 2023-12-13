package com.simplilearn.Inheritance;

//This multilevel inheritance

public class MultilevelIheritance {

	public static void main(String[] args) {
		
      Carnivores Bear=new Omnivores();
      Bear.eat();
      System.out.println("---------------------");
      Herbivores Goat=new Herbivores();
      Goat.eat();
	}

}
//Super most class
class Animals{
	
}
//second super class
class Herbivores extends Animals{
	public void eat() {
		System.out.println("They can eat only plants");
	}
	
}
//second super class
class Carnivores extends Animals{
	public void eat() {
		System.out.println("They can eat only animals");
	}
	
}
//child class
class Omnivores extends Carnivores{
	@Override
	public void eat() {
		System.out.println("They can eat both animals and plants");
	}
	
}
