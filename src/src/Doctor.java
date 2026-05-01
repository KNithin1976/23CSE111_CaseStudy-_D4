

package Case_Study;

class Doctor {

int doctorId;
String name;
String specialization;

Doctor(int doctorId, String name, String specialization) {
	this.doctorId = doctorId;
	this.name = name;
	this.specialization = specialization;
}

Prescription writePrescription(String medicine) {
	System.out.println("Doctor " + name + " prescribed: " + medicine);
	return new Prescription(medicine);
	}
}
