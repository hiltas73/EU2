package assignment_EU2.assignment6_forLoop;

public class A5q14 {
/*
	##
	# #
	#  #
	#   #
	#    #
	#     #
	#      #
*/

	public static void main(String[] args) {

		for(int LineNo=1; LineNo<=7; LineNo++) {
			for(int sign1=1; sign1<=(0*LineNo)+1; sign1++) {
				System.out.print("#");
			}
			for(int s=1; s<=(1*LineNo)-1; s++) {
				System.out.print(" ");
			}
			for(int sign2=1; sign2<=(0*LineNo)+1; sign2++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
