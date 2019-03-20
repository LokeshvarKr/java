package assignment1.question3;
import java.util.Vector;

public class Invoice {
	 Vector<InventoryItem> invoice = new Vector<InventoryItem>();
	public void addItem(InventoryItem item){
		invoice.add(item);
	}
	public void removeItem(InventoryItem item){
		invoice.remove(item);
	}
	public void removeItem(int itemIndex){
		invoice.remove(itemIndex);
	}
	public double calculateAmount(){
		double amount = 0;
		
		return amount;
	}
	public void ShowInvoideDetails() {
		int count=0;
		for(InventoryItem i:invoice) {
			count+=1;
			System.out.println("InventoryItem "+count);
			i.display();
			System.out.println();
		}
	}
}
