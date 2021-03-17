package assignment_EU2.assignment11_mix;

import java.util.Arrays;

public class ex2 {

	public static void main(String[] args) {
		
		int[] inhabitants = {3,6,0,4,3,2,7,0};
		calc(inhabitants);

	}
	public static void calc(int[] arr) {
				
		int day = 0;
		label:
		for(int i=0; i<arr.length; i++) {
			System.out.println("Day " + day + " " + Arrays.toString(arr));

	        int[] arrayCopy = arr;

	        //for the first element
	        if (arr[0] == 0) {
	            arrayCopy[1] = arr[1] / 2;
	        }

	        //for element in the middle
	        for (int k = 1; k < arr.length - 1; k++) {

	            if (arr[k] == 0) {
	                arrayCopy[k - 1] = arr[k - 1] / 2;
	                arrayCopy[k + 1] = arr[k + 1] / 2;
	            }
	        }

	        //for the last element
	        if (arr[arr.length - 1] == 0) {
	            arrayCopy[arr.length - 2] = arr[arr.length - 2] / 2;
	        }

	        //copies clone back to original array
	        arr = arrayCopy;
	        
	        day++;

	        //if each element value in every city is zero, we stop
	        if(sum(arr) == 0) {
	        	System.out.println("Day " + day + " " + Arrays.toString(arr));
	        	System.out.println("------- E X T I N C T -------");
	        	break label;
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

