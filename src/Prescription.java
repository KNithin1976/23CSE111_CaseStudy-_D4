package sources;

class Prescription {
        private String medicine;

    Prescription(String medicine) {
        this.medicine = medicine;
    }

    
    public String getMedicine() { return medicine; }
    public void setMedicine(String medicine) { this.medicine = medicine; }

    void displayPrescription() {
        System.out.println("Medicine: " + medicine);
    }
}
