package assignment_EU2.assignment7_nested_forLoop;

public class A5q11_numPattern {

	public static void main(String[] args) {
/***
 * 4 3 2 1
 *  3 2 1
 *   2 1
 *    1
 *    
 *    
 */
		for(int LineNo=1; LineNo<=4; LineNo++) {
			for(int space=0; space<(+1*LineNo)-1; space++) {
				System.out.print(" ");
			}
			for(int num=(-1*LineNo)+5; num>=1; num--) {
				System.out.print(num + " ");
			}
			System.out.println();

		}
		
	}

}
