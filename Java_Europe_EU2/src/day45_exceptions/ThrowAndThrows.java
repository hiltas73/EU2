package day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello world");

		//throw new RuntimeException("This is some exception");
		
		
		
		//throw new Exception("Another exception");
		 
		
		
		String username = "";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid username");
		}
		
		
	}

}
