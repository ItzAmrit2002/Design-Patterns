package FactroryPattern.Correct;

public class Restaurant {
    public Burger orderBurger(String request){
        Burger burger = null;
        if(request.equals("cheeseburger")){
            burger = new CheeseBurger();
        } else if(request.equals("chickenburger")){
            burger = new ChickenBurger();
        }
        burger.prepare();
        return burger;
    }    
}
