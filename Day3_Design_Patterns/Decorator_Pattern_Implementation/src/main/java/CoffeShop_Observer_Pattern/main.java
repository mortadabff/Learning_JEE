package CoffeShop_Observer_Pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Coffee simpleCoffee = new SimpleCoffee();
		        System.out.println(simpleCoffee.getDescription() + " Cost: $" + simpleCoffee.cost());

		        Coffee milkCoffee = new CoffeeWithMilk(simpleCoffee);
		        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.cost());

		        Coffee sugarMilkCoffee = new CoffeeWithSugar(milkCoffee);
		        System.out.println(sugarMilkCoffee.getDescription() + " Cost: $" + sugarMilkCoffee.cost());
		    }
}
