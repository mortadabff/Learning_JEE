package CoffeShop_Observer_Pattern;



public class CoffeeWithMilk extends CoffeeDecorator {
    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
