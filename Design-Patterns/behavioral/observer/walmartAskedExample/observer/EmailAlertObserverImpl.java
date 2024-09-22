package behavioral.observer.walmartAskedExample.observer;

import behavioral.observer.walmartAskedExample.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessageOnEmail(emailId, "product is in stock hurry up !!");
    }

    private void sendMessageOnEmail(String emailId, String msg) {
        System.out.println("Message : " + msg + '\n' + "send on mobile with email " + emailId );
    }
}
