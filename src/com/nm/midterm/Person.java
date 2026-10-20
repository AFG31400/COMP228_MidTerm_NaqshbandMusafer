package com.nm.midterm;
//starting point

public abstract class Person {
	
	protected final int personId;
	
	private String name;
	
	private String phoneNumber;
	
	private static int personCount = 0;
	
	Person(int personId, String name,  String phoneNumber) {
	
	this.personId = personId;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.personCount++;
	
	}

	  static int getpersonCount() {
		return personCount;
	}
	  
	  String getName() {
		  return name;
	  }
	
	  String getNumber() {
		  return phoneNumber;
	  }
	  
	  void displaybasicDetails() {
		  System.out.println("The ID number of this person is: " + personId);
		  System.out.println("The person's name is: " + name);
		  System.out.println("The phone number of this person is: " + phoneNumber);
	  }
	  
	   abstract String getRoleDescription(); 

	   
	   @Override
	 public  String toString() {
		   return "person{ID: " + personId + " Name: " + name + " Phone Number: " + phoneNumber + "}";
	   }
		   
	   
}
