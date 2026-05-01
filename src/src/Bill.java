package Case_Study;


class Bill {

    double consultationFee;
    double medicineCost;

    Bill(double consultationFee, double medicineCost) {
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    double calculateTotal() {
        return consultationFee + medicineCost;
    }

    void generateBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Cost: " + medicineCost);
        System.out.println("Total Bill: " + calculateTotal());
    }
}