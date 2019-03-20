package assignment1.question3;

import java.util.Scanner;

public class InventoryItem {
	static int itemId;
	private String itemName;
	private String description;
	private double price;
	
	//static initialization block
	static{
		itemId=0;
	}
	
	//instance initialization block
	{
		InventoryItem.itemId+=1;
	}
	
	public void setItemDetails() {
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		System.out.println("Enter itemName");
		this.itemName=scan.next();
		System.out.println("Enter description");
		this.description=scan.next();
		System.out.println("Enter price");
		this.price=Double.parseDouble(scan.next());
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		InventoryItem.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println("-------------------------------------------");
		System.out.println(itemId);
		System.out.println(itemName);
		System.out.println(description);
		System.out.println(price);
		System.out.println("-------------------------------------------");
	}
	@Override
	public String toString() {
		return "InventoryItem [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description
				+ ", price=" + price + "]";
	}
	
}
