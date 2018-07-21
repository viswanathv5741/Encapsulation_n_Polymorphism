package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors;
	ArrayList<Patient> patients;
	
	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public ArrayList<Patient> getPatients(){
		return patients; 
	}
	public void assignPatientsToDoctors() {
		int i=0;
		for (Doctor d: doctors) {
			for (int p=0; p<patients.size(); p++) {
				try {
					d.assignPatient(patients.get(p));
					patients.remove(p);
					p--;
				}catch(Exception DoctorFullException){
					break;
				}
			}
		}
	}
}
