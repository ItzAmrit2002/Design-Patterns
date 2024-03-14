package ObserverPattern;

public class EmailMsgListener implements Listener{
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event event) {
        System.out.println("Email sent to " + email + " for event: " + event);
    }
}
