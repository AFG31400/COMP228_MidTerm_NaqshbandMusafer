package com.nm.midterm;
//Inherits one single time from Person
public class Patient extends Person{
	
	private final int patientNumber;
	
	private int age;
	
	private String medicalDepartment;
	
	private double consultationFee;
	
	private static int patientCount = 0;
	
	
	public Patient(int patientNumber, int age, String medicalDepartment, double consultationFee, int personId, String name, String phoneNumber) {
		super(personId, name, phoneNumber);
		this.patientNumber = patientNumber;
		this.age = age;
		this.medicalDepartment = medicalDepartment;
		this.consultationFee = consultationFee;
		patientCount++;
		
	}
	
	
	public void registerPatient(String name, int age) {
		if (age <= 0 || name == null) {
			System.out.println("Invalid name or age");
		}	else {
				this.age= age;
				System.out.println("Patient registered"); 
				}
			}
			
			
		public void registerPatient(String name, String medicalDepartment, double consultationFee) {
			if (medicalDepartment == null || consultationFee <= 0) {
				System.out.println("Incorrect medical department or insufficient funds for consultations");
			}
			else {
				this.medicalDepartment = medicalDepartment;
				System.out.println("Department: " + medicalDepartment);
			}
		}
	
	
	public static int getpatientCount() {
		return patientCount;
	}
	
	public void patientDetails() {
		System.out.println("PATIENT DETAILS");
		
		displaybasicDetails();
		
		System.out.println("The patient ID of the patient: " + patientNumber);
		System.out.println("The age of the patient: " + age);
		System.out.println("The medical department of the patient: " + medicalDepartment);
		System.out.println("Consultation fees: $" + consultationFee + "\n");
	}

	@Override 
	public String getRoleDescription() {
		return "Role: Patient";
	}
}
