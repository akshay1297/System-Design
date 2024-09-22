package creational.factory.notification;

public class User {
    public static void main(String[] args){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification emailNotification = notificationFactory.createNotification("email");
        emailNotification.sendNotification();
        Notification smsNotification = notificationFactory.createNotification("sms");
        smsNotification.sendNotification();
    }

}
