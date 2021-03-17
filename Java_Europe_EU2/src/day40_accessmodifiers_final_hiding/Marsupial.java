package day40_accessmodifiers_final_hiding;

public class Marsupial {
	
	public static boolean isBiped() {
		System.out.println("isBiped in Marsupial");
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs: " + isBiped());
	}

}
