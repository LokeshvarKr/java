
import java.util.Scanner; 
class Account{
	private int balance;

	public Account(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return this.balance;
	}
	public boolean isSufficientAmount(int whithdrawAmount){
		if(balance > whithdrawAmount){
			return true;
		}
		else{
			return false;
		}
	}
	public void whithdraw(int withdrawAmount){
		balance=balance-withdrawAmount;
	}
}

class Customer implements Runnable{
	private String name;
	private Account account;
	
	public Customer(String name,Account account){
		this.name=name;
		this.account=account;
	}

	public void run(){
		
		Scanner scan=new Scanner(System.in);
		scan.useDelimiter("\n");
		
		
		synchronized(account){
			System.out.println(name+" : Please Enter withdraw Amount");
			int withdrawAmount=Integer.parseInt(scan.next());
			if(account.isSufficientAmount(withdrawAmount)){
				account.whithdraw(withdrawAmount);
				System.out.println(name+" : current Balance is "+account.getBalance());
			}
			else{
				System.out.println(name+" : current Balance is insufficient");
			}
		}
	}
}
public class MultipleThreadSynchronization{
	public static void main(String[] args) {
		
		Account a=new Account(10000);

		Customer c1=new Customer("Lokesh",a);
		Customer c2=new Customer("Harsha",a);

		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);

		t1.start();
		t2.start();
	}
}