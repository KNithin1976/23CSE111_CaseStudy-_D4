package Case_Study;

class Patient {
int patientId;
String name;
int age;
String symptoms;
Patient(int patientId, String name, int age, String symptoms) {
	this.patientId = patientId;
	this.name = name;
	this.age = age;
	this.symptoms = symptoms;;
}

void registerPatient() {
	System.out.println("Patient Registered: " + name);;
}


void viewDetails() {
	System.out.println("Patient ID: " + patientId);
	System.out.println("Name: " + name);
	System.out.println("Symptoms: " + symptoms);
	}
}
