package day40_accessmodifiers_final_hiding;

public class Bird extends Pet {

	public boolean twoLegs() {
		System.out.println("twoLegs method in Bird");
		return true;
	}
	public void getBirdDescription() {
		System.out.println("Bird walks on two legs: " + twoLegs());
	}

}
