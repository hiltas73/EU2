package day23_stringManipulationLab_randomClasss;


public class repl210 {

	public static void main(String[] args) {
		/***
		 * Given a string, that contains special character 
		 * together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), 
		 * reverse the string in a way that special characters are not affected
		 */

		String str1 = "!%a&b/()c";
		System.out.println(reverseStr(str1));
	
}
	public static String reverseStr(String str) {
		char[] charArray = str.toCharArray();
		String strTemp = "";
		int counter = 0;
		
		for(int i = charArray.length-1; i>=0; i--) {
			if(Character.isAlphabetic(charArray[i])) {
				strTemp += charArray[i];
			}			
		}
		for(int i = 0; i < charArray.length; i++) {
			if(Character.isAlphabetic(charArray[i])) {
				charArray[i]=strTemp.charAt(counter);
				counter++;
			}
		}
		//String strReverse = Arrays.toString(charArray);
		//System.out.println(strReverse);
		String strReverse = "";
		for(int i = 0; i < charArray.length; i++) {
			strReverse += charArray[i];
		}
		//System.out.println(strReverse);
		
		return strReverse;
	}
}