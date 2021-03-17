package day40_accessmodifiers_final_hiding;

public class Kangaroo extends Marsupial {

	public static boolean isBiped() {
		System.out.println("isBiped in Kangaroo");
		return true;
	}	
		
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	

}
