package ObserverPattern;
import java.util.*;
public class NotificationService {
    private final Map<Event, List<Listener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, Listener listener) {
        customers.get(event).add(listener);
    }

    public void unsubscribe(Event event, Listener listener) {
        customers.get(event).remove(listener);
    }

    public void notify(Event event) {
        customers.get(event).forEach(listener -> listener.update(event));
    }
}
