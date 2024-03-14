package ObserverPattern; // Correct the package declaration


// Remove the unused import statement
// import ObserverPattern.Event;

public class MainApp {
    public static void main(String[] args) {
        // Your code here

        
        Store store = new Store();
        store.getService().subscribe(Event.NEW_ITEM, new EmailMsgListener("customer1@gmail.com"));

        store.getService().subscribe(Event.SALE, new MobileAppListener(1234567890));
        store.getService().subscribe(Event.SALE, new EmailMsgListener(("customer3@gmail.com")));

        store.newItemPromotion();
        store.salePromotion();

        store.getService().unsubscribe(Event.NEW_ITEM, new EmailMsgListener("customer1@gmail.com"));

        store.salePromotion();
    }
}