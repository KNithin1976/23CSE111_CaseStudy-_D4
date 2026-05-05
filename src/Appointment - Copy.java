package sources;

class Appointment {
    private int appointmentId;
    private String date;

    Appointment(int appointmentId, String date) {
        this.appointmentId = appointmentId;
        this.date = date;
    }

   
    public int getAppointmentId() { return appointmentId; }
    public String getDate() { return date; }

    public void setAppointmentId(int appointmentId) { this.appointmentId = appointmentId; }
    public void setDate(String date) { this.date = date; }

    void bookAppointment(Patient patient, Doctor doctor) {
        System.out.println("Appointment booked for " + patient.getName() +
                " with Dr. " + doctor.getName() + " on " + date);
    }
}
