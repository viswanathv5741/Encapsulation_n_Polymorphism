package _04_hospital;

public class Surgeon extends Doctor{
	private boolean doSurgery;
	
	public Surgeon() {
		doSurgery = false;
	}
	
	public boolean performsSurgery() {
		doSurgery = true;
		return doSurgery;
	}
	
}
