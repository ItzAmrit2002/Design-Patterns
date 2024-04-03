package AdapterPattern;

public class Zomato implements MultiRestoApp{
    
    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Displaying menu in Zomato");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying recommendations in Zomato");
    }
}
