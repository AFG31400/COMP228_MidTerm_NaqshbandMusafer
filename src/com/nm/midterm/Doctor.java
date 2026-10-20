package com.nm.midterm;
//Inherits from Medical Staff, also includes Reportable and Schedulable as interfaces

public class Doctor extends MedicalStaff implements Reportable, Schedulable{
	
	private final double consultationFee;
	
	private int patientsSeen;

	public Doctor(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, double consultationFee, int patientsSeen) {

	    super(personId, name, phoneNumber, staffId, department, monthlySalary);
	    this.consultationFee = consultationFee;
	    this.patientsSeen = patientsSeen;
	}
	
	
	double calculateMonthlyCompensation() {
		return getMonthlySalary() + patientsSeen * 10;
	}
	
	double calculateconsultationFee() {
		return consultationFee;
	}
	
	double calculateconsultationFee(double discount) {
		return consultationFee - discount;
	} 
	
	double calculateconsultationFee(double discount, double additionalCharge) {
		return consultationFee - discount + additionalCharge;
	}
	
	public void displayStaffDetails() {
	System.out.println("DOCTOR DETAILS");
	displaybasicDetails();
	System.out.print(getRoleDescription());
	
	System.out.println("\nStaff ID " + getStaffId());
	System.out.println("Department: " + getDepartment());
	System.out.println("Patients seen: " + patientsSeen);
	System.out.println("Consultation fees: " + calculateconsultationFee());
	System.out.println("Monthly compensation: " + calculateMonthlyCompensation());
	System.out.println("Monthly salary:" + getMonthlySalary() + "\n");
	
	
	}
	
	@Override
	public String getRoleDescription()
	{ return "Role: Doctor"; }
	
	 
	    public void generateReport() {
	        System.out.println("Doctor Report");
	        displayStaffDetails(); 
	 }
	 
	 
	  
	  public void scheduleAppointment(String appointmentDate) {
	    	if (appointmentDate == null) {
	    		System.out.println("Invalid");
	  }
	    else {
	 System.out.println("Appointment scheduled on: " + appointmentDate); }
	    
	 }
}
	
	
