package assignment_EU2.lab2;

import java.util.Scanner;

public class q1alternative {

	public static void main(String[] args) {
		
		
				
			Scanner s=new Scanner(System.in);			
			
			boolean flag=true;
			boolean firsttime=true;
			int min=0,max=0;			
			
			do {
				
				if(firsttime) {
					
					System.out.println("Enter your first number: ");
					int num1=s.nextInt();
					
					System.out.println("Enter your next number: ");
					int num2=s.nextInt();
					
					if(num1<num2) {
						min=num1; max=num2;
					}else {
						min=num2; max=num1;
					}
					firsttime=false;
				}else {
					System.out.println("Enter your first number: ");
					int num1=s.nextInt();
				
					System.out.println("Enter your next number: ");
					int num2=s.nextInt();
				
					if(num1<num2 && num1<min) {
						min=num1;
						if(num2>max) {
							max=num2;
						}
					}else if(num1<num2 && min<num1) {
						
						if(num2>max) {
							max=num2;
						}
					}else if(num2<num1 && num2<min) {
						min=num2;
						if(num1>max) {
							max=num1;
						}
					}else if(num2<num1 && min<num2) {
						
						if(num1>max) {
							max=num1;
						}
					}
				}
				
				
				System.out.println("Do you want to enter another number: 0-No, 1-Yes");
				int finl=s.nextInt();
				if(finl==0) {
					flag=false;
				}
				
				
			}while(flag);
			
			   System.out.println("Smallest Number is: " + min);
			   System.out.println("Largest Number is: " + max);
			
			
			}
			
				
				
		

	}


