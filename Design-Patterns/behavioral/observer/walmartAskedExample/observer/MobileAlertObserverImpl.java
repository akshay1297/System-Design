package behavioral.observer.walmartAskedExample.observer;

import behavioral.observer.walmartAskedExample.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    private String contactNumber;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String contactNumber, StocksObservable stocksObservable) {
        this.contactNumber = contactNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(contactNumber, "product is in stock hurry up !!");
    }

    private void sendMessageOnMobile(String contactNumber, String msg) {
        System.out.println("Message : " + msg + '\n' + "send on mobile with contactNumber " + contactNumber );
    }
}
