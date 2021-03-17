package assignment_EU2.assignment14;

import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */

public class TJMaxx {
	
	/**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;
	
	/**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
	public TJMaxx() {
		regularItems = new ArrayList<Item>();
		onSaleItems = new ArrayList<OnSaleItem>();
	}
	
	/**
     * adds an item object to regularItems list
     * @param item
     */
	public void addRegularItem(Item item) {
		regularItems.add(item);
	}
	
	/**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
	public void addOnSaleItems(OnSaleItem item) {
		onSaleItems.add(item);
	}

	/**
     * getter for regularItems
     * @return
     */
	public List<Item> getRegularItems() {
		return regularItems;
	}

	/**
     * getter for onSaleItems
     * @return
     */
	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}
	
	/**
     * return count of regularItem object
     * @return
     */
	public int regularItemsCount() {
		return regularItems.size();
	}
	
	/**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
	public int onSaleItemsCount() {
		return onSaleItems.size();
	}
	
	/**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
	public List<String> getALLItemsNames(){
		List<String> names = new ArrayList<>();
		for(Item each:regularItems) {
			names.add(each.getName());
		}
		for(OnSaleItem each: onSaleItems) {
			names.add(each.getName());
		}
		return names;
	}
	
	/**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
	public double getItemPrice(int catalogNumber) {
//		List<Item> fullItemList = new ArrayList<>();
//		fullItemList.addAll(regularItems);
//		fullItemList.addAll(onSaleItems);
//		for(Item each:fullItemList) {
//			if(each.getCatalogNumber()==catalogNumber) {
//				return each.getPrice();
//			}
//		}
		for(Item eachItem : regularItems) {
			if (eachItem.getCatalogNumber()==catalogNumber) {
				return eachItem.getPrice();
			}
		}
		
		for(OnSaleItem eachItem : onSaleItems) {
			if(eachItem.getCatalogNumber()==catalogNumber) {
				return eachItem.getPrice();
			}
		}
		
		return 0.0;
	}
	
	/**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
	public OnSaleItem getOnSaleItem(String name) {
		for(OnSaleItem eachItem:onSaleItems) {
			if(eachItem.getName().equals(name)) {
				return eachItem;
			}	
		}
		return null;
	}
	
	/**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
	public void removeItem(int catalogNumber) {
		
//		regularItems.removeIf(eachItem -> eachItem.getCatalogNumber() == catalogNumber);
//		onSaleItems.removeIf(eachItem -> eachItem.getCatalogNumber() == catalogNumber);
		
		for(Item eachItem:regularItems) {
			if(eachItem.getCatalogNumber()==catalogNumber) {
				regularItems.remove(eachItem);
			}
		}
		for(OnSaleItem eachItem:onSaleItems) {
			if(eachItem.getCatalogNumber()==catalogNumber) {
				onSaleItems.remove(eachItem);
			}
		}
	}
	
	/**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
	public void buyItem(int catalogNumber) {
		
		for(Item eachItem:regularItems) {
			if(eachItem.getCatalogNumber() == catalogNumber) {
				eachItem.setQuantity(eachItem.getQuantity()-1);
				if(eachItem.getQuantity() == 0) {
					removeItem(eachItem.getCatalogNumber());
				}
			}
		}
		for(Item eachItem : onSaleItems) {
			if(eachItem.getCatalogNumber() == catalogNumber) {
				eachItem.setQuantity(eachItem.getQuantity()-1);
				if(eachItem.getQuantity() == 0) {
					removeItem(eachItem.getCatalogNumber());
				}
			}
		}
	
	}

}
