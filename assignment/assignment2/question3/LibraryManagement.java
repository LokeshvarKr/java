package assignment2.question3;

import java.util.ArrayList;
import java.util.Scanner;

import assignment2.question3.Author;
import assignment2.question3.Book;
import assignment2.question3.Library;

public class LibraryManagement {

	public  static void main(String []args) {
		Library library=new Library();
		boolean condition1 = true;
		boolean condition2=true;
		boolean persent=false;
		String barcode=null;
		String title=null;
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		while(condition1==true) {
			System.out.println("1 addBook ");
			System.out.println("2 printBookDetails ");
			System.out.println("3 getAllBookDetails ");
			System.out.println("4 getNumberOfCopies ");
			System.out.println("5 getAuthorOfBook ");
			System.out.println("6 borrow a book");
			System.out.println("7 return book");
			System.out.println("8 Exit ");
			int choice=0;
			condition2=true;
			while(condition2==true){
				try {
					choice= Integer.parseInt(scan.next());
					condition2=false;
				}
				catch(Exception e){
					System.out.println("Enter correct option");
				}
			}
			
			switch(choice) {
			case 1:
				
				System.out.println("Enter Book Details");
				System.out.println("Enter Book Title");
				title=scan.next();
				System.out.println("Enter Number of copies");
				int copies=0;
				condition2=true;
				while(condition2==true) {
					try {
						copies=Integer.parseInt(scan.next());
						condition2=false;
					}
					catch(Exception e) {
						System.out.println("Enter Number of copies as integer value ");
					}
				}
				persent=library.increamentBookCopies(title, copies);
				if(persent==true) {
					System.out.println("Added Successfully");
				}
				else {				
					System.out.println("Enter Auther Details");
					System.out.println("Enter Number of Authors of this Book");
					try 
					{
						int x = Integer.parseInt(scan.next());
						if(x >=5  && x<=0) {
							throw new Exception("Number of auther should be 1 to 5");
						}
						ArrayList<Author> authers=new ArrayList<Author>();
						for(int i=0;i<x;i++) {
							System.out.println("Enter Auther "+(i+1)+" Details");
							System.out.println("Enter First Name");
							String firstName=scan.next();
							System.out.println("Enter Last Name");
							String lastName=scan.next();
							System.out.println("Enter Email Id");
							String emailId=scan.next();
							System.out.println("Enter Address");
							String address=scan.next();
							Author a=new Author(firstName, lastName, emailId, address);
							authers.add(a);
						}
						System.out.println("Enter Price");
						double price=Double.parseDouble(scan.next());
						System.out.println("Enter Publisher Details");
						String publisher=scan.next();
						System.out.println("Enter Year of Publication");
						int yop=Integer.parseInt(scan.next());
						
						Book b=new Book(title, authers, price, publisher, yop);
						library.addBook(b);
						boolean added=library.increamentBookCopies(title, copies);
						if(!added) {
							System.out.println("Copies Not added ");
						}
					}
					catch(Exception e){
						System.out.println("Not added books");
					}
				}
				
				break;
				
			case 2:
					System.out.println("Enter Book Title");
					title=scan.next();
					library.printBookDetails(title);
				break;
			case 3:
				library.getAllBookDetails();
				break;
			case 4:
				System.out.println("Enter Book Title");
				title=scan.next();
				int cNumber=library.getNumberOfCopies(title);
				if(cNumber !=-1) {
					System.out.println("Number of copies : "+cNumber);
				}
				else {
					System.out.println("No such book is persent");
				}
				break;
			case 5:
				System.out.println("Enter Book Title");
				title=scan.next();
				library.printAuthorsOfBook(title);
				break;
			case 6:
				System.out.println("Enter Title of Book");
				title=scan.next();
				barcode=library.borrowBook(title);
				if(barcode!=null) {
					System.out.println("barcode of assigned book :"+barcode);
				}
				else {
					System.out.println("No book copy is persent now");
				}
				break;
			case 7:
				System.out.println("Enter Title of Book");
				title=scan.next();
				System.out.println("Enter barcode of Book");
				barcode=scan.next();
				library.returnBook(title, barcode);
				break;
			case 8:
				condition1=false;
				System.out.println("Thank You");
				break;
			default:
				condition1=false;
				System.out.println("Thank You");
				break;
				
			}
		}
	}
}
