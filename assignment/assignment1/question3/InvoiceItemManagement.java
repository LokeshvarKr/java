package assignment1.question3;

import java.util.HashMap;
import java.util.Scanner;

public class InvoiceItemManagement {
	public static void main(String [] args) {
		HashMap<String,Invoice> invoiceList=new HashMap<String,Invoice>();
		Scanner scan=new Scanner(System.in);
		boolean condition=true;
		boolean persent=false;
		String invoiceName="";
		while(condition==true) {
			System.out.println("1 create new Invoice");
			System.out.println("2 insert item in Existing invoice");
			System.out.println("3 Show an Existing Invoice");
			System.out.println("4 Show all Invoice");
			System.out.println("5 quit");
			System.out.println("Enter your choice");
			int choice =Integer.parseInt(scan.next());
			switch(choice) {
			case 1:
				System.out.println("Enter Invoice name as identity of new Invoice");
				invoiceName=scan.next();
				persent=true;
				while(persent==true) {
					if(invoiceList.containsKey(invoiceName)) {
						System.out.println("This invoice exist Please Enter unique name for new Invoice");
						invoiceName=scan.next();
					}
					else {
						persent=false;
						Invoice invoice=new Invoice();
						invoiceList.put(invoiceName,invoice);
					}
				}
				
				break;
				
			case 2:
				System.out.println("Enter Invoice name");
				invoiceName=scan.next();
				persent=false;
				while(persent==false){
					if(!invoiceList.containsKey(invoiceName)) {
						System.out.println("This invoice name not found ,Please enter correct invoice name");
						invoiceName=scan.next();
					}
					else {
						persent=true;
						Invoice invoice =invoiceList.get(invoiceName);
						InventoryItem item=new InventoryItem();
						try {
							item.setItemDetails();
							invoice.addItem(item);
						}
						catch(Exception e) {
							System.out.println(e.getMessage());
						}
					}
				}
				
				break;
				
			case 3:
				System.out.println("Enter Invoice name");
				invoiceName=scan.next();
				persent=false;
				while(persent==false){
					if(!invoiceList.containsKey(invoiceName)) {
						System.out.println("This invoice name not found ,Please enter correct invoice name");
						invoiceName=scan.next();
					}
					else {
						persent=true;
						Invoice invoice =invoiceList.get(invoiceName);
						invoice.ShowInvoideDetails();
					}
				}
				
				break;
			case 4:
				for(String id: invoiceList.keySet()) {
					System.out.println("=================================");
					System.out.println("invoice name: "+id);
					System.out.println();

					Invoice invoice=invoiceList.get(id);
					invoice.ShowInvoideDetails();
					System.out.println("=================================");
				}
				break;
			case 5:
				condition=false;
				break;
			}
			
			System.out.println("Exit");

		}
		
	}
}

