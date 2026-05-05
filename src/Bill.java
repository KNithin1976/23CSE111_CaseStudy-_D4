package sources;

class Bill {
   
    private double consultationFee;
    private double medicineCost;

    Bill(double consultationFee, double medicineCost) {
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

   
    public double getConsultationFee() { return consultationFee; }
    public double getMedicineCost() { return medicineCost; }

    public void setConsultationFee(double consultationFee) { this.consultationFee = consultationFee; }
    public void setMedicineCost(double medicineCost) { this.medicineCost = medicineCost; }

    double calculateTotal() {
        return consultationFee + medicineCost;
    }

    void generateBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Cost: " + medicineCost);
        System.out.println("Total Bill: " + calculateTotal());
    }
}
