package creational.factory.notification;

public class SmsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Send SMS notification.");
    }
}
