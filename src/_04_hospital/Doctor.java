package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients; 
	
	public Doctor() {
		patients = new ArrayList<Patient>();
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	public boolean performsSurgery() {
		return false; 
	}
	public void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() >=3) {
			throw new DoctorFullException();
		}
		patients.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	public void doMedicine() {
		for (Patient p: patients) {
			p.checkPulse();
		}
	}
	
}
