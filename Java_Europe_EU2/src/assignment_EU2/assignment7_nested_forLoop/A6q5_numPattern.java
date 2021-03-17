package assignment_EU2.assignment7_nested_forLoop;

public class A6q5_numPattern {

	public static void main(String[] args) {
		
/***
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/
		
		for(int LineNo = 1; LineNo<=7; LineNo++) {
			for(int num1 = 1; num1<=(-1*LineNo)+7; num1++) {
				System.out.print(1);
			}
			for(int num2 = 1; num2<=(1*LineNo)+0; num2++) {
				System.out.print(LineNo);
			}
			System.out.println();
		}
		
	}

}
