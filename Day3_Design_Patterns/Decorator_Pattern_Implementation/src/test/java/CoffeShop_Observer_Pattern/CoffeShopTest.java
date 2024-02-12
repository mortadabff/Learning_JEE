package CoffeShop_Observer_Pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeShopTest {

	@Test
    public void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        assertEquals("Simple Coffee", coffee.getDescription());
        assertEquals(1.0, coffee.cost(), 0.0);
    }

    @Test
    public void testCoffeeWithMilk() {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkCoffee = new CoffeeWithMilk(simpleCoffee);
        assertEquals("Simple Coffee, with milk", milkCoffee.getDescription());
        assertEquals(1.5, milkCoffee.cost(), 0.0);
    }

    @Test
    public void testCoffeeWithSugar() {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee sugarCoffee = new CoffeeWithSugar(simpleCoffee);
        assertEquals("Simple Coffee, with sugar", sugarCoffee.getDescription());
        assertEquals(1.3, sugarCoffee.cost(), 0.0);
    }

    @Test
    public void testCoffeeWithMilkAndSugar() {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkCoffee = new CoffeeWithMilk(simpleCoffee);
        Coffee sugarMilkCoffee = new CoffeeWithSugar(milkCoffee);
        assertEquals("Simple Coffee, with milk, with sugar", sugarMilkCoffee.getDescription());
        assertEquals(1.8, sugarMilkCoffee.cost(), 0.0);
    }

}
