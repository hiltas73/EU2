package examples;

public class AnimalTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cat myCat = new Cat();
//        Animal myAnimal = myCat;
//        Animal.testClassMethod();
//        
//        myAnimal.testInstanceMethod();
//        myCat.testInstanceMethod();
//        System.out.println("=================");
//        
//        Animal animal = new Animal();
//        animal.testClassMethod();
//        animal.testInstanceMethod();
		
//		Cat myCat = new Cat();
//		myCat.override();
//		myCat.hide();
//		System.out.println("===========================");
		
		Animal myAnimal = new Animal();
		myAnimal.override();
		myAnimal.hide();
		System.out.println("===========================");
//		
//		Animal anml = myCat;
//		anml.override();
//		anml.hide();
	}
	/**
	 * Overriding occurs only with instance methods.
	 * On the other hand, method hiding works with static methods
	 * 
	 */

}
