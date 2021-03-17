package day40_accessmodifiers_final_hiding;

public class TestParentChild {

	public static void main(String[] args) {
		
		GrandChild gChild = new GrandChild();
		gChild.instanceMethod();
		gChild.staticMethod();
		
		System.out.println("=============================");
		
		Child child = gChild;	//overriding instance method
		child.instanceMethod();
		child.staticMethod();
		
		System.out.println("=============================");
		
		Parent parent = gChild;
		parent.instanceMethod(); //overriding instance method
		parent.staticMethod();
		
	}
}
