 package com.simplilearn.Inheritance;

 //Multiple inheritance is not possible in java.because, it creates ambiguity between classes.
 
public class MultipleInheritance {

	public static void main(String[] args) {
		
       Duck duck1=new Duck();
      duck1.swim();
	}

}

//super class
class Swimmer{
	void swim(){
		System.out.println("They can swim");
	}
	
}
//super class
class Walker{
	void walk(){
		System.out.println("They can walk");
		
	}
	
}
//super class
class Flyer{
	void fly(){
		System.out.println("They can fly.");
	}
	
}

// class Duck extends Swimmer,Flyer{
//    Duck(){
//        System.out.println("They can swim and fly");
//    }
//}

//child class
class Duck extends Swimmer{
	
	@Override
	void swim() {
		System.out.println("I am a Duck and I can swim");
	}
	
	
	
}