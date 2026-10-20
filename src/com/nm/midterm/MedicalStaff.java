package com.nm.midterm;
//inherits from person, inherits to doctor, nurse, specialist doctor
public abstract class MedicalStaff extends Person{
	
	private final int staffId;
	
	private String department;
	
	private double monthlySalary;
	
	private static int staffCount = 0;
	
	public MedicalStaff(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary ) {
	super(personId, name, phoneNumber);
	this.staffId = staffId;
	this.department = department;
	this.monthlySalary = monthlySalary;
	staffCount++;
	
	}
	abstract double calculateMonthlyCompensation();
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void displayStaffDetails() {
		System.out.println("STAFF DETAILS");
		
		displaybasicDetails();
		
		System.out.println("Staff ID: " + staffId);
		System.out.println("Staff Department: " + department);
		System.out.println("Monthly Salary: " + monthlySalary + "\n");
		
		}
	public static int getStaffCount() {
		return staffCount;
		
	}
	
	public int getStaffId() {
	    return staffId;
	}
	
	@Override 
	public String getRoleDescription() {
		return "Role: Medical Staff"; 
		}
}
