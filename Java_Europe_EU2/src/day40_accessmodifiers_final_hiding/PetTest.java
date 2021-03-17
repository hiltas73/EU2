package day40_accessmodifiers_final_hiding;

public class PetTest {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.getPetDescription();
		bird.getBirdDescription();
		
		System.out.println("==============================");
		
//		Pet pet = new Pet();
//		pet.getPetDescription();
		
	}
	
	/***
	The method defined in the child class must be marked as static if it is
	marked as static in the parent class (METHOD HIDING). 
	Likewise, the method must not be marked as static in the child class if it is not
	marked as static in the parent class (METHOD OVERRIDING)
	 */
	
	/**
	 * Overriding occurs only with instance methods.
	 * On the other hand, method hiding works with static ones
	 *
	 */

}
