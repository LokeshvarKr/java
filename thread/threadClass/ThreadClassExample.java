
//here , as we know java doesn't support multiple inheritance
// and class A is extending Thread class so class A can't extend another class 


// but if we use Runnable interface then we can implement this Runnable interface and 
//we can extend another class at the same time, so this is the advantage of using 
//Runnable interface over extending Thread class

class A extends Thread{
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

class B extends Thread{
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
class ThreadClassExample{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
	}
}