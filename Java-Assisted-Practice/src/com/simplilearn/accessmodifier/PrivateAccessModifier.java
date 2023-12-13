package com.simplilearn.accessmodifier;

public class PrivateAccessModifier {

	public static void main(String[] args) {
       BankAccount account = new BankAccount();
		
		// access private data member
		// account.accNo; // The field BankAccount.accNo is not visible
		// account.accBalance; // The field BankAccount.accBalance is not visible
		// account.fullName; // The field BankAccount.accBalance is not visible
		// account.showEmail();  // The method showEmail() from the type BankAccount is not visible
		
		// public methods
		account.showName();
		account.showBalance();
	}

}

class BankAccount {
	
	// data members
	private long accNo = 92134348;
	private double accBalance = 99214.454d;
	private String fullName = "Shubhman Gill";
	private String email = "Gill@gmail.com";
	
	// methods
	private String showEmail() {
		return this.email;
	}
	
	public void showBalance() {
		System.out.println("The Account : " + this.accNo + " has balance : $"+this.accBalance);
	}
	
	public void showName() {
		System.out.println("The Account : " + this.accNo + " blongs to : "+this.fullName);
	}
	
	public BankAccount() { }
	
	// private BankAccount() { }  // Private Constructor based class can not be instantiated.
	
	
}