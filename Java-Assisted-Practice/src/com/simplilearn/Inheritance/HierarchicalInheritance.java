package com.simplilearn.Inheritance;

//This Hierarchical Inheritance

public class HierarchicalInheritance {

	public static void main(String[] args) {
		SeniorManager sme=new SeniorManager("xyz",833,14500.23,"IT",13);
		System.out.println(sme);
		System.out.println("-----------------------");
		Developer dev=new Developer("oooo",281,18000.21);
		System.out.println(dev);
		

	}

}
//super class
class Employee{
	String name;
	int id;
	double salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
}
//child class
class Developer extends Employee{
	String role="Developer";

	public Developer(String name, int id, double salary) {
		super(name, id, salary);
		
	}

	@Override
	public String toString() {
		return "Developer [role=" + role + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
//child class
class Tester extends Employee{
	public Tester(String name, int id, double salary) {
		super(name, id, salary);
		
	}
	

	@Override
	public String toString() {
		return "Tester [role=" + role + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}


	String role="Tester";
	
	
	
}
//child class
class Manager extends Employee{
	String department;

	@Override
	public String toString() {
		return "Manager [department=" + department + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public Manager(String name, int id, double salary, String department) {
		super(name, id, salary);
		this.department = department;
	}
	
	
}
//child class
class SeniorManager extends Manager{
	

	@Override
	public String toString() {
		return "SeniorManager [exeperience=" + exeperience + ", department=" + department + ", name=" + name + ", id="
				+ id + ", salary=" + salary + "]";
	}

	public SeniorManager(String name, int id, double salary, String department, int exeperience) {
		super(name, id, salary, department);
		this.exeperience = exeperience;
	}

	int exeperience;
	
}
