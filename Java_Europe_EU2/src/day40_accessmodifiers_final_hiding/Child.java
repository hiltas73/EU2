package day40_accessmodifiers_final_hiding;

public class Child extends Parent {	
	
	public void instanceMethod() {
		System.out.println("instance method in Child class");		
	}

	public static void staticMethod() {
		System.out.println("static method in Child class");
	}

}
