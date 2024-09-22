package creational.factory.notification;

public class NotificationFactory {
    public Notification createNotification(String request){
        Notification notification = null;
        if("sms".equalsIgnoreCase(request)){
            notification = new SmsNotification();
        }
        else if("email".equalsIgnoreCase(request)){
            notification = new EmailNotification();
        }
//        if(notification != null){
//            notification.sendNotification();
//        }

        return notification;
    }
}
