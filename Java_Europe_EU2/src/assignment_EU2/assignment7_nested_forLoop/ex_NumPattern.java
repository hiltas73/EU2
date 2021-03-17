package assignment_EU2.assignment7_nested_forLoop;

public class ex_NumPattern {

	public static void main(String[] args) {

/***
 * for (line going 1 to 4) {		
		write (1 * lineNo -1 ) spaces on the output line.		
		write (-2 * lineNo +9) some numbers on the output line.		

 */
		
		for(int i = 1; i<=4; i++) {    //LINES
			for(int s=0; s<=(1*i)-1; s++) { //SPACES
				System.out.print(" ");
			}
			for(int n=1;n<=(-2*i)+9; n++) { //NUMBERS
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
