package assignment_EU2.assignment11_mix;

import java.util.Arrays;

public class ex {

	public static void main(String[] args) {
		int[] inhabitants = {3,6,0,4,3,2,7,0};
		calc(inhabitants);

	}
	public static void calc(int[] arr) {
		
		boolean keepGoing = true;
		
		int d = 0;
	    while (keepGoing) {

	        int[] arrayCopy = arr;

	        //for the first element
	        if (arr[0] == 0) {
	            arrayCopy[1] = arr[1] / 2;
	        }

	        //for element in the middle
	        for (int i = 1; i < arr.length - 1; i++) {

	            if (arr[i] == 0) {
	                arrayCopy[i - 1] = arr[i - 1] / 2;
	                arrayCopy[i + 1] = arr[i + 1] / 2;
	            }

	        }

	        //for the last element
	        if (arr[arr.length - 1] == 0) {
	            arrayCopy[arr.length - 2] = arr[arr.length - 2] / 2;
	        }

	        //copies clone back to original array
	        arr = arrayCopy;
	        System.out.println("Day " + d + " " + Arrays.toString(arr));

	        d++;

	        int counter = 0;
	        //for each element checking if every city is zero
	        for (int element : arr) {
	            counter = counter + element;
	        }

	        //if each element value in every city is zero, we stop
	        if (counter == 0) {
	            keepGoing = false;
	        }
	    }
	}
	
	
		public static int sum(int[] inhabitants) {
		  	
			int sum = 0;
		  	for (int i = 0; i < inhabitants.length; i++) {
		  		sum = sum + inhabitants[i];
		  	}
		  	
		  	return sum;
		  	
		}
}
	
