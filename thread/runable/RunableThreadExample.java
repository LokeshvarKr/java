

class A implements Runnable{
	public void run(){
		
		for (int i=0;i<10;i++){
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

			System.out.println("A "+i);

		}


		/*try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}*/

	}
}

class B implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){

			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

			System.out.println("B "+i);
		}

		/*try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}*/

	}
}
class RunableThreadExample{
	public static void main(String[] args) {
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}
}