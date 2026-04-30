package Case_Study;

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
    }
}