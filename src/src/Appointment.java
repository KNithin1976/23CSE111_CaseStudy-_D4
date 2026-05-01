package Case_Study;

class Appointment {

    int appointmentId;
    String date;

    Appointment(int appointmentId, String date) {
        this.appointmentId = appointmentId;
        this.date = date;
    }

    void bookAppointment(Patient patient, Doctor doctor) {
        System.out.println("Appointment booked for " + patient.name +
                " with Dr. " + doctor.name + " on " + date);
    }
}