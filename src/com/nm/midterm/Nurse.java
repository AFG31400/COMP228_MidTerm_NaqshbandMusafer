package com.nm.midterm;
//Inherits from Medical staff

public class Nurse extends MedicalStaff{
	
	private final String shiftType;
	
	private final double shiftAllowance;

	public Nurse(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, String shiftType, double shiftAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		// TODO Auto-generated constructor stub
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	double calculateMonthlyCompensation() {
	    return getMonthlySalary() + shiftAllowance;
	}
	
	public void displayStaffDetails() {
   	 System.out.println("NURSE DETAILS");
        displaybasicDetails();
        System.out.println(getRoleDescription());
        System.out.println("Staff ID: " + getStaffId());
        System.out.println("Department: " + getDepartment());
        System.out.println("Shift time: " + shiftType);
        System.out.println("Monthly compensation: " + calculateMonthlyCompensation());
        System.out.println("Shift allowance: " + shiftAllowance);
        
	}

	@Override
	public String getRoleDescription() {
	    return "Role: Nurse";
	}
}
