package assignment1.question2;

public class CoffeeMakerMachine implements CoffeeMachine {
	private int  coffeePowder;
	private double milk;
	private double water;
	
	public CoffeeMakerMachine(){
		this.coffeePowder=0;
		this.milk=0;
		this.water=0;
	}
	
	
	public void setCoffeePowder(double coffePowder) {
		
		if(this.coffeePowder + coffeePowder <= 500) {
			this.coffeePowder += coffeePowder;
		}
		else {
			System.out.println("Error : CoffeePowder can OverFlow");
		}
	}
	
	
	public void setMilk(double milk) {
		if(this.milk + milk <= 1) {
			this.milk += milk;
		}
		else {
			System.out.println("Error : Milk can OverFlow");
		}
	}

	

	public void setWater(double water) {
		if(this.water + water <= 2) {
			this.water += water;
		}
		else {
			System.out.println("Error : Water can OverFlow");
		}
	}

	@Override
	public void makeMilkCoffee() {
		if(this.coffeePowder >= 10 && this.milk >=0.4 && this.water >= 0.2) {
			this.coffeePowder=this.coffeePowder-10;
			this.milk=this.milk-0.4;
			this.water=this.water-0.2;
			System.out.println("Milk coffee is ready");
		}
		else {
			System.out.println("Status of Machine --");
			this.displayStatus();
			System.out.println("please fill the needy gradients");
		}
	}
	@Override
	public void makeBlackCoffee() {
		if(this.coffeePowder >= 10 && this.water >= 0.2) {
			this.coffeePowder=this.coffeePowder-10;
			this.water=this.water-0.2;
			System.out.println("Black coffee is ready");
		}
		else {
			System.out.println("Status of Machine --");
			this.displayStatus();
			System.out.println("please fill the needy gradients");
		}
	}

	@Override
	public void fillIngredient(int coffeePowder,double water,double milk) {
		if(this.coffeePowder + coffeePowder <= 500 && 
				this.water + water <= 2  && this.milk + milk <= 1) {
			this.coffeePowder += coffeePowder;
			this.water+=water;
			this.milk +=milk;
		}
		else {
			System.out.println("Error: Gradients can Overflow");
			System.out.println("Status of Machine---");
			this.displayStatus();
			System.out.println("fill only needy gradients");

		}
	}

	@Override
	public void loadWithFullCapacity() {
		
			this.coffeePowder = 500;
			this.water=2;
			this.milk =1;
			this.displayStatus();
	}

	@Override
	public void cleanMachine() {
		System.out.println("machine is cleaning........");
		this.coffeePowder=0;
		this.milk=0;
		this.water=0;
		System.out.println("machine is cleaned");
		System.out.println("Machine Status---");
		this.displayStatus();
	}
	
	@Override
	public void displayStatus() {
		System.out.println("CoffeeMakerMachine [coffeePowder=" + coffeePowder + " grams" + ", "
				+ "milk=" + milk + " liter" + ", water=" + water + " liter" + "]");
	}	

}
