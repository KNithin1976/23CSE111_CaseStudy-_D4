package sources;

import java.io.FileWriter;    
import java.io.IOException;   

public class Main {
    public static void main(String[] args) {

        
        Department dept = new Department("Cardiology");
        dept.showDepartment();

        Patient patient = new Patient(1, "Arun", 30, "Chest Pain");
        patient.registerPatient();
        patient.viewDetails();

        
        Doctor doctor = new Doctor(101, "Sharma", "Cardiologist");

        Appointment appointment = new Appointment(5001, "20 June 2026");
        appointment.bookAppointment(patient, doctor);

        Prescription prescription = doctor.writePrescription("Aspirin");
        prescription.displayPrescription();

        Bill bill = new Bill(500, 200);
        bill.generateBill();

      
        Administrator admin = new Administrator("Admin1");
        admin.viewSystemReport(patient, bill);

        System.out.println("\nPatient discharged successfully.");

       
        try {
            FileWriter writer = new FileWriter("PatientReport.txt");
            writer.write("===== HOSPITAL MANAGEMENT SYSTEM - PATIENT REPORT =====\n");
            writer.write("Department: " + dept.getDepartmentName() + "\n");
            writer.write("Patient ID: " + patient.getPatientId() + "\n");
            writer.write("Patient Name: " + patient.getName() + "\n");
            writer.write("Age: " + patient.getAge() + "\n");
            writer.write("Symptoms: " + patient.getSymptoms() + "\n");
            writer.write("Attending Doctor: Dr. " + doctor.getName() + "\n");
            writer.write("Specialization: " + doctor.getSpecialization() + "\n");
            writer.write("Appointment Date: " + appointment.getDate() + "\n");
            writer.write("Medicine Prescribed: " + prescription.getMedicine() + "\n");
            writer.write("Consultation Fee: " + bill.getConsultationFee() + "\n");
            writer.write("Medicine Cost: " + bill.getMedicineCost() + "\n");
            writer.write("Total Bill: " + bill.calculateTotal() + "\n");
            writer.write("Reviewed By: " + admin.getName() + "\n");
            writer.write("Status: Discharged Successfully\n");
            writer.close();
            System.out.println("\nPatient report saved to PatientReport.txt");
        } catch (IOException e) {
        	
            
            System.out.println("Error writing patient report: " + e.getMessage());
        }
    }
}
