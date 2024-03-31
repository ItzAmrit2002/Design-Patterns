package DecoratorPattern;

public class ExtraCheese extends BurgerDecorator{
    private Burger burger;

    public ExtraCheese(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Extra Cheese";
    }

    @Override
    public double getPrice() {
        return burger.getPrice() + 50.0;
    }
    
}
