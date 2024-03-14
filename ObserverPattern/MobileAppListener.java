package ObserverPattern;

public class MobileAppListener implements Listener{
    long mobileNumber;

    public MobileAppListener(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void update(Event event) {
        System.out.println("SMS sent to " + mobileNumber + " for event: " + event);
    }
}
