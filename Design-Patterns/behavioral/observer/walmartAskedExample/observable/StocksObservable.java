package behavioral.observer.walmartAskedExample.observable;

import behavioral.observer.walmartAskedExample.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int newStockCount);
    int getStockCount();
}
