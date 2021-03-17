package assignment_EU2.assignment14;

import java.util.ArrayList;
import java.util.List;

public class TJMaxStore {

	public static void main(String[] args) {
		/*
		 * In this assignment you will practice:
		inheritance
		constructors and calling parent class constructor
		overriding
		list with custom classes
		Please follow the instructions on top of each method.
		Work on this flow:
		Item > OnSaleItem > TJMaxx
		Item.javaPreview the document
		OnSaleItem.javaPreview the document
		TJMaxx.javaPreview the document	
		 */
	
		Item itemShirt = new Item("shirt", 100, 50, 20.0);
		Item itemTShirtItem = new Item("T-shirt", 200, 30, 25.0);
		OnSaleItem onSaleItem = new OnSaleItem("shirt", 40, 100, 30.0, 10.0);
		System.out.println(onSaleItem.getPrice());
		
		
	}

}
