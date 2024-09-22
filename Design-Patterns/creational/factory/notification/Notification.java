package creational.factory.notification;

/*
Scenario: You have different types of notifications,
        such as Email and SMS. You want to create a notification without specifying
        the exact class of object that will be created.
 */

// product
public interface Notification {
    void sendNotification();
}
