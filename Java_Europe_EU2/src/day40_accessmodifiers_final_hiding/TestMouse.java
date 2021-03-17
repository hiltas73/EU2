package day40_accessmodifiers_final_hiding;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		//mouse.getRodentDetails();
		
		mouse.getMouseDetails();

		//If it is instance method => overriding, but if it is static method => hiding

		/***
		The method defined in the child class must be marked as static if it is
		marked as static in the parent class (method hiding). Likewise, the
		method must not be marked as static in the child class if it is not
		marked as static in the parent class (method overriding)
		 */
	}

}
