package examples;

public class test2 {

	public static void main(String[] args) {
		//System.out.println(c_profits(20,30));
		

	}
	public static String c_profits (int buyPrice,int sellPrice){
	   
	   if(sellPrice>buyPrice){
	       return "profit";
	   }else if (sellPrice<buyPrice){
	      return "loss";
	   }else {
	     return "no loss";
	   }
	  }

}
