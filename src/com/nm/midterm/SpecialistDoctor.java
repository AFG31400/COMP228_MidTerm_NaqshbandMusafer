package com.nm.midterm;
//inherits from doctor > Medical staff > Person

public class SpecialistDoctor extends Doctor{

    private final String specialization;
   
    private final double specialistSurcharge;

        public SpecialistDoctor(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, double consultationFee, int patientsSeen, String specialization, double specialistSurcharge) 
     {
        	super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientsSeen);
      this.specialization = specialization;
      this.specialistSurcharge = specialistSurcharge;
    }

           double calculateconsultationFee() {
      return super.calculateconsultationFee() + specialistSurcharge;
    }
        
     public void displayStaffDetails() {
    	 System.out.println("SPECIALIST DOCTOR DETAILS");
         displaybasicDetails();
        System.out.print(getRoleDescription());
         
     System.out.println("\nStaff ID: " + getStaffId());
     System.out.println("Department: " + getDepartment());
     System.out.println("Monthly salary: " + getMonthlySalary());
     System.out.println("Specialization: " + specialization);
     System.out.println("Specialist surcharge: " + specialistSurcharge); 
     System.out.println("Consultation fees: " + calculateconsultationFee());
     System.out.println("Monthly compensation: " + calculateMonthlyCompensation() + "\n"); 
    }

    @Override
    public String getRoleDescription() {
        return "Role: Specialist Doctor";
    }
    
}

