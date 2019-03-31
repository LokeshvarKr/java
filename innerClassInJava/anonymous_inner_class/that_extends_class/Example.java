public class Example{
	public static void main(String[] args) {
		Thread t=new Thread(){
			public void run(){
				System.out.println("Extended Thread Class To Create Anonymous class");
			}
		};

		t.start();
		System.out.println("Main Thread");
	}
}