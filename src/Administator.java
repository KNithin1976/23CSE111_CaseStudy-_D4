package Case_Study;

class Administrator {

    String adminName;

    Administrator(String adminName) {
        this.adminName = adminName;
    }

    void viewSystemReport(Patient patient, Bill bill) {
        System.out.println("\nAdministrator " + adminName + " reviewing system report...");
        System.out.println("Patient Treated: " + patient.name);
        System.out.println("Total Revenue Generated: " + bill.calculateTotal());
        System.out.println("System functioning normally.");
    }
}
