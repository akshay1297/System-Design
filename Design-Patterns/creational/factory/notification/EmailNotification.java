package creational.factory.notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Email notification is sent.");
    }
}
