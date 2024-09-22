package behavioral.observer.walmartAskedExample.observable;

import behavioral.observer.walmartAskedExample.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
            for(NotificationAlertObserver obj : observerList){
                obj.update();
            }
    }

    @Override
    public void setStockCount(int newStockCount) {
            if(this.stockCount == 0){
                notifySubscribers();
            }
            stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
            return this.stockCount;
    }
}
