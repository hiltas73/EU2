package assignment_EU2.assignment6_forLoop;

public class Question7 {
/**
* 4 3 2 1 
   3 2 1 
    2 1 
     1 
*/


	public static void main(String[] args) {
		
		for(int LineNo=4;LineNo>=1;LineNo--) {
			
			for(int space=1;space<=4-LineNo;space++) {
				System.out.print(" ");
			}
			
			for(int num=LineNo;num>0;num--) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		

	}

}
