package assignment_EU2.assignment3_arithmeticOperators;

import java.util.Scanner;

/*

Question-7

Write a program that determines the change to be dispensed from a vending machine. 
An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (
25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles
 */

public class Question7 {

	public static void main(String[] args) {
		
		int priceInCents = 95;
		
		int change = 100 - priceInCents; 
		
		int quarter = change / 25; 
		
		int dimes = (change % 25)/10; 
		
		int nickles = ((change % 25) % 10)/5;
		
		System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
		System.out.println(813/100%3);
		System.out.println(813%100/3+2.4);
		
		//1. WRITE YOUR CODE HERE:
	    //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
	    /*Scanner sc = new Scanner(System.in);
	    int hour   = sc.nextInt();
	    int minute = sc.nextInt();
	    int second = sc.nextInt();
	    String amOrPm = sc.next();
	    //#############################
	     //2. WRITE YOUR CODE HERE:
	     System.out.println(hour+":"+minute+":"+second+" "+amOrPm);
	     System.out.println(3+2+"+"+ 4+5+(5+5));*/
		
		/*int a=5;
		a=a++;
		//int b=a++;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a++);
		//System.out.println(b);
		System.out.println(a);*/
		
		int a = 5;
		int b = 3;
		int c = a * b++;   // c is set to 15
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		int d = a * ++b;   // d is set to 20
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
	}

}
