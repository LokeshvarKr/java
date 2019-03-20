package assignment1.question2;

public interface CoffeeMachine {
	void makeBlackCoffee();
	void makeMilkCoffee();
	void fillIngredient(int coffeePowder, double water, double milk);
	void loadWithFullCapacity();
	void cleanMachine();
	void displayStatus();
}
