package DecoratorPattern;

public class ExtraMayo extends BurgerDecorator {
    private Burger burger;

    public ExtraMayo(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Extra Mayo";
    }

    @Override
    public double getPrice() {
        return burger.getPrice() + 30.0;
    }
    
}
