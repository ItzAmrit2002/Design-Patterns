package ObserverPattern;


public class Store {
    private final NotificationService service;

    public Store() {
        this.service = new NotificationService();
    }

    public void newItemPromotion() {
        service.notify(Event.NEW_ITEM);
    }

    public void salePromotion() {
        service.notify(Event.SALE);
    }

    public NotificationService getService() {
        return service;
    }
}
