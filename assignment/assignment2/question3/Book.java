package assignment2.question3;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

public class Book {
	
	private String title;
	private ArrayList <Author> author;
	private double price;
	private String publisher;
	private int yearOfPublication;
	private int numberOfCopies;
	private ArrayList<BookCopy>bookCopyList;
	private static  HashSet<String> barcodeList= new HashSet<String>();
	
	public Book(String title, ArrayList<Author> auther,double price, String publisher, int yearOfPublication) {
		super();
		this.title = title;
		this.author = auther;
		this.price=price;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numberOfCopies =0;
		this.bookCopyList=new ArrayList<BookCopy>();
	}
	
	private String getBarcode() {
		String bcode="";
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			int x=rand.nextInt(10);
			bcode+=String.valueOf(x);
		}
		return bcode;
	}
	
	public void addBookCopy(int copies) {
		String bcode=null;
		for(int i=0;i<copies;i++) {
			boolean done=true;
			while(done){
				bcode=getBarcode();
				if(!barcodeList.contains(bcode)){
					done=false;
				}
			}
			barcodeList.add(bcode);
			BookCopy bookcopy=new BookCopy(bcode);
			bookCopyList.add(bookcopy);
		}
		this.numberOfCopies+=copies;
	}
	public String borrowBookCopy() {
		String bcode=null;
		for(BookCopy b: this.bookCopyList) {
			if(b.isRented()==false){
				bcode=b.getBarcode();
				b.setRented(true);
			}
		}
		return bcode;
	}
	public boolean returnBookCopy(String barcode) {
		boolean done=false;
		for(BookCopy b: this.bookCopyList) {
			if(b.getBarcode().equalsIgnoreCase(barcode)){
				b.setRented(false);
				done=true;
			}
		}
		return done;
	}
	public String getTitle() {
		return title;
	}
	
	public ArrayList<Author> getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public double getPrice() {
		return price;
	}
	public void bookDetails() {
		System.out.println("==========================================");
		System.out.println("Title = " + title);
		System.out.println("Authers ");
		int i=1;
		for(Author a: author){
			if(i==1) {
				System.out.println("---------------------------------------");
			}
			System.out.println("Auther "+i);
			i+=1;
			a.printAuther();
			System.out.println("---------------------------------------");

		}
		System.out.println("Publisher = " + publisher);
		System.out.println("Year Of Publication = " +yearOfPublication);
		System.out.println("Number Of Copies = " +numberOfCopies);
		System.out.println("==========================================");
	}

	public void getBookCopyList(){
		System.out.println("==========================================");
		System.out.println("Book Details:");
		this.bookDetails();
		System.out.println("Copies Details");
		for(int i=0;i<bookCopyList.size();i++) {
			BookCopy c=bookCopyList.get(i);
			System.out.println(c.getBookCopyDetails());
		}
		System.out.println("==========================================");

	}

	
	
}
