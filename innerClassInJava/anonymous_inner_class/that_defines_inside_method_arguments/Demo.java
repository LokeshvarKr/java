public class Demo{
	public static void main(String[] args) {

		//anonymous class that defines inside constructor arguments
		Thread t=new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("anonymous class that defines inside constructor arguments");
			} 
		});

		t.start();
	}
}