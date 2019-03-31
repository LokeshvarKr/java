public class DaemonThread extends Thread {
	public DaemonThread(String name){
		super(name);
	}
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(getName()+"current Thread is Daemon Thread");
		}
		else{
				System.out.println(getName()+"current Thread is User Thread");
		}
	}

	public static void main(String[] args) {
		DaemonThread t1=new DaemonThread("t1");
		DaemonThread t2=new DaemonThread("t2");
		DaemonThread t3=new DaemonThread("t3");
		DaemonThread t4=new DaemonThread("t4");

		t1.setDaemon(true);
		t1.start();

		t2.start();

		t3.setDaemon(true);
		t3.start();

		//below code will throw exception as setDaemon() method calling after start() method calling
		//t4.start();
		//t4.setDaemon(true);  
	}
}