package day40_accessmodifiers_final_hiding;

public class GrandChild extends Child {
	
	public void instanceMethod() {
		System.out.println("instance method in Grand-Child class");		
	}

	public static void staticMethod() {
		System.out.println("static method in Grand-Child class");
	}

}
