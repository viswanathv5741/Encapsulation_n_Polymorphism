package _04_hospital;

public class Patient {
	private boolean pulseChecked, caredFor;
	
	public Patient() {
		pulseChecked = false;
		caredFor = false;
	}
	
	public void checkPulse() {
		pulseChecked = true;
	}
	
	public boolean feelsCaredFor() {
		caredFor = pulseChecked;
		return caredFor;
	}
}
