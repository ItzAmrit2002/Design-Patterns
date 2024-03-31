package DecoratorPattern;

public class Driver {
    public static void main(String[] args) {
        
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + " : " + burger.getPrice());
        
        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription() + " : " + burger.getPrice());

        burger = new ExtraMayo(burger);
        System.out.println(burger.getDescription() + " : " + burger.getPrice());
    }
}
