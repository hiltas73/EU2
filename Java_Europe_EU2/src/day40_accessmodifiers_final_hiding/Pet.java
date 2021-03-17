package day40_accessmodifiers_final_hiding;

public class Pet {
	
	public boolean twoLegs() {
		return false;
	}
	
	public void getPetDescription() {
		System.out.println("Pet walks on the two legs:" + twoLegs());
	}

}
