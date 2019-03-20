package assignment2.question3;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	
	HashMap<String,Book> bookList=new HashMap<String,Book>();
	
	
	public String borrowBook(String title) {
		String bcode=null;
		for(String t :bookList.keySet()) {
			if(t.equalsIgnoreCase(title)) {
				Book b=bookList.get(t);
				bcode=b.borrowBookCopy();
			}
		}
		return bcode;
	}
	public void returnBook(String title,String barcode) {
		boolean done=false;
		for(String t :bookList.keySet()) {
			if(t.equalsIgnoreCase(title)) {
				Book b=bookList.get(t);
				done=b.returnBookCopy(barcode);
			}
		}
		if(done==true) {
			System.out.println("Title "+title+"Barcode "+barcode+" Returned successfully");
		}
		else {
			System.out.println("Title "+title+"Barcode "+barcode+" No such book found");
		}
	}
	public void addBook(Book book) {
		this.bookList.put(book.getTitle(),book);
	}
	public boolean increamentBookCopies(String title,int copies) {
		boolean done=false;
		for(String t :bookList.keySet()) {
			if(t.equalsIgnoreCase(title)) {
				Book b=bookList.get(t);
				b.addBookCopy(copies);
				done=true;
			}
		}
		return done;	
	}
	public void printBookDetails(String title){
		boolean done=false;
		for(String t:bookList.keySet()){
			if(t.equalsIgnoreCase(title)) {
				done=true;
				Book b=bookList.get(t);
				b.bookDetails();
			}
		}
		if(done==false) {
			System.out.println("No such Book is Persent");
		}
	}
	
	public void getAllBookDetails() {
		System.out.println("====================================");
		System.out.println("====================================");
		for(String title:bookList.keySet()) {
			Book b=bookList.get(title);
			b.bookDetails();
			System.out.println("====================================");
		}
		System.out.println("====================================");

	}
	public int getNumberOfCopies(String title) {
		int copies=-1;
		for(String t :bookList.keySet()) {
			if(t.equalsIgnoreCase(title)) {
				Book b=bookList.get(t);
				copies=b.getNumberOfCopies();
			}
		}
		return copies;
	}
	
	public void printAuthorsOfBook(String title){
		ArrayList<Author> authors=null;
		for(String t :bookList.keySet()) {
			if(t.equalsIgnoreCase(title)) {
				Book b=bookList.get(t);
				authors=b.getAuthor();
			}
		}
		if(authors !=null) {
			int i=1;
			System.out.println("====================================");
			for(Author a: authors) {
				a.printAuther();
				System.out.println("------------------------------------");
				i+=1;
			}
			System.out.println("====================================");

		}
	}

	
	
	
}
