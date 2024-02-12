package CoffeShop_Observer_Pattern;

public class CoffeeWithSugar extends CoffeeDecorator {
    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.3;
    }
}
