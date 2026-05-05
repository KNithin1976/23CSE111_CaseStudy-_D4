package sources;

class Administrator extends Person {

    Administrator(String adminName) {
        super(adminName);  
    }

    
    void displayInfo() {
        System.out.println("Administrator: " + getName());
    }

    void viewSystemReport(Patient patient, Bill bill) {
        System.out.println("\nAdministrator " + getName() + " reviewing system report...");
        System.out.println("Patient Treated: " + patient.getName());
        System.out.println("Total Revenue Generated: " + bill.calculateTotal());
        System.out.println("System functioning normally.");
    }
}
