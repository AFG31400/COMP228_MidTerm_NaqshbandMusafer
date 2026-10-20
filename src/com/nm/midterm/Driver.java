package com.nm.midterm;

public class Driver {
	
	public static void main(String[] args) {
		
		Patient patient1 = new Patient(101, 0, "Dental", 450, 1011, "Malcom", "416-999-0119");
		
		Patient patient2 = new Patient(202, 41, "Radiology", 190, 2022, "Harry", "647-999-9312");
		
		Doctor doctor1 = new Doctor(250, "Paco", "416-809-9089", 303, "General", 9000, 200, 30);
		
		SpecialistDoctor specialdoctor1 = new SpecialistDoctor(312, "Harman", "647-767-1123", 404, "Neurology", 10000, 250, 500, "Neurologist", 50);
		
		Nurse nurse1 = new Nurse(909, "Sara", "437-124-9874", 708, "General", 5000, "Night", 100);
		
		//Runtime polymorphism
		MedicalStaff staffMember = new Doctor(117, "Lanry", "414-222-0909", 711, "Surgeon", 9500, 150, 400);
		
		patient1.registerPatient("Malcom", 0);
		patient1.patientDetails();
		
		patient2.registerPatient("Harry", 41);
		patient2.registerPatient("Harry", "Radiology", 190);
		patient2.patientDetails();
	
		doctor1.displayStaffDetails();
		
		//Running Poly'd doctor
		staffMember.displayStaffDetails();
		
		specialdoctor1.displayStaffDetails();
		specialdoctor1.generateReport();
		specialdoctor1.scheduleAppointment("2026-10-20\n");
		
		nurse1.displayStaffDetails();
		
		System.out.println("\nThere are " + Patient.getpatientCount() + " number(s) of patients");
		System.out.println("There are " + MedicalStaff.getStaffCount() + " number(s) of staff");
		System.out.println("There are " + Person.getpersonCount() + " number(s) of people in total at the hospital");
		
	}

}
