package _04_hospital;

public class GeneralPractitioner extends Doctor {
	public GeneralPractitioner() {
		
	}
	
	@Override
	public boolean makesHouseCalls() {
		return true;
	}
}
