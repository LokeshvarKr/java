package assignment2.question3;

public class BookCopy {
	private String barcode;
	private boolean rented;
	
	public BookCopy(String barcode) {
		this.barcode = barcode;
		this.rented = false;
	}
	public String getBarcode() {
		return barcode;
	}
	public boolean isRented() {
		return rented;
	}
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	public String getBookCopyDetails() {
		return "[barcode=" + barcode + ", rented=" + rented + "]";
	}
	
}
