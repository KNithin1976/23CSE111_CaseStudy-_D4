package sources;


class Doctor extends Person {
   
    private int doctorId;
    private String specialization;

    Doctor(int doctorId, String name, String specialization) {
        super(name); 
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public int getDoctorId() { return doctorId; }
    public String getSpecialization() { return specialization; }

    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    
    void displayInfo() {
        System.out.println("Doctor: Dr. " + getName() + " | Specialization: " + specialization);
    }

    Prescription writePrescription(String medicine) {
        System.out.println("Doctor " + getName() + " prescribed: " + medicine);
        return new Prescription(medicine);
    }
}
