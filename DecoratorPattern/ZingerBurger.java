package DecoratorPattern;

public class ZingerBurger extends Burger{

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getPrice() {
        return 200.0;
    }
    
}
