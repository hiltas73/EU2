package assignment_EU2.assignment13_mix;

import java.util.*;


public class Question74 {

	  public static void main(String[] args){
		  
		  int[] inhabitants = {3,6,0,4,3,2,7,0};
		  zombieAttack(inhabitants);		  
		  
	  }
	  
	  public static int sum(int[] arr) {		  	
			int sum = 0;
		  	for (int i = 0; i < arr.length; i++) {
		  		sum = sum + arr[i];
		  	}		  	
		  	return sum;		  	
		}
	  
	  public static void zombieAttack(int[] arr) {
		  int day = 0;
		  
		  label:
		  for(int d=0; d<arr.length; d++) {
			  System.out.println("Day " + day + Arrays.toString(arr));
			  
			  if(sum(arr) == 0){
				  System.out.println("------- EXTINCT -------");
				  break label;				  
			  }
			  if(arr[d]==0) {
				  arr[d+1] = arr[d+1] / 2;
			  }
			  if(arr[arr.length-1]==0) {
				  arr[arr.length-2] = arr[arr.length-2] / 2;
			  }
				  
			  for(int k = d+1; k<arr.length-2; k++) {					  
				  if(arr[k] == 0) {						  
					arr[k-1] = arr[k-1]/2;
					arr[k+1] = arr[k+1]/2;
					}
			  
			  
			  }
			  
		  }
		  day++;
	  }

}
