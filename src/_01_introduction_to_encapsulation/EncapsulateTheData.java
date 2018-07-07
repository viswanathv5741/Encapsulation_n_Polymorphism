package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public EncapsulateTheData(int x, float y, String a, Object b) {
		itemsReceived = x;
		degreesTurned = y;
		nomenclature = a;
		memberObj = b;
	}
	
	public int limitNum() {
		if (itemsReceived <0) {
			itemsReceived = 0;
		}
		return itemsReceived;
	}
	
	public float limitDegrees() {
		if (degreesTurned < 0.0) {
			degreesTurned = (float) 0.0;
		}
		else if (degreesTurned > 360.0) {
			degreesTurned = (float) 360.0;
		}
		return degreesTurned;
	}
	
	public String fixNomenClature() {
		if (nomenclature.length() == 0) {
			nomenclature = " ";
		}
		return nomenclature;
	}
	
	public Object fixType() {
		if (memberObj instanceof String) {
			memberObj = (Object)memberObj;
		}
		return memberObj;
	}
	
	public static void main(String[] args) {
		EncapsulateTheData test = new EncapsulateTheData(-3, (float)354.4, "h", "hello");
		System.out.println(test.limitNum());
		System.out.println(test.limitDegrees());
		System.out.println(test.fixNomenClature());
		System.out.println(test.fixType());
	}
}
