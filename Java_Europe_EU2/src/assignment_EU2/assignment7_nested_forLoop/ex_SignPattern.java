package assignment_EU2.assignment7_nested_forLoop;

public class ex_SignPattern {

	public static void main(String[] args) {

/***
 * for (line going 1 to 5) {						
	write (-1 * lineNo +5 ) spaces on the output line.					
	write (+2 * lineNo -1) # signs on the output line.					
	go to a new output line.					
	}					

    #
   ###
  #####
 #######
#########
 */
		
		for(int lineNo = 1; lineNo<=5; lineNo++) {					//for loop for LINES
			for(int s = 1; s<=(-1*lineNo)+5;s++) {		//for loop for SPACE
				System.out.print(" ");
			}
			for(int h = 1; h<=(+2*lineNo)-1; h++) {		//for loop for # SIGN
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
