package com.simplilearn.Class_Object_Constructor;



public class Course {

	public static void main(String[] args) {
		
		//Object creation
		Trainer Trainer1=new Trainer("Wahid",32,"Java",8);
		Trainer Trainer2=new Trainer("Sahil",29,"Selenium",4);
		Trainer Trainer3=new Trainer("Suvitha",30,"SQL",7);
		Trainer Trainer4=new Trainer("Vimala",27,"Framework",12);
		
		System.out.println(Trainer1);
		System.out.println(Trainer2);
		System.out.println(Trainer3);
		System.out.println(Trainer4);
		 
		

	}

}

//Class creation
 class Trainer{
	 String name;
	 int age;
	 String subject;
	 int experience;
	 
	 //Default constructor
	 public Trainer() {}
	 
	 //Constructor creation
	public Trainer(String name, int age, String subject, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", age=" + age + ", subject=" + subject + ", experience=" + experience + "]";
	}

	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected String getSubject() {
		return subject;
	}
	protected void setSubject(String subject) {
		this.subject = subject;
	}
	protected int getExperience() {
		return experience;
	}
	protected void setExperience(int experience) {
		this.experience = experience;
	}
	 
 }

