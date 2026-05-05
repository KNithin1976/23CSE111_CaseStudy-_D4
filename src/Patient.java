package sources;

class Patient {
    
    private int patientId;
    private String name;
    private int age;
    private String symptoms;

    Patient(int patientId, String name, int age, String symptoms) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSymptoms() { return symptoms; }

    public void setPatientId(int patientId) { this.patientId = patientId; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }

    void registerPatient() {
        System.out.println("Patient Registered: " + name);
    }

    void viewDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Symptoms: " + symptoms);
    }
}
