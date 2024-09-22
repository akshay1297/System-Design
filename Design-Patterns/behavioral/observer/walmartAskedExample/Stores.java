package behavioral.observer.walmartAskedExample;

import behavioral.observer.walmartAskedExample.observable.IphoneObservableImpl;
import behavioral.observer.walmartAskedExample.observable.StocksObservable;
import behavioral.observer.walmartAskedExample.observer.EmailAlertObserverImpl;
import behavioral.observer.walmartAskedExample.observer.MobileAlertObserverImpl;
import behavioral.observer.walmartAskedExample.observer.NotificationAlertObserver;

public class Stores {
    public static void main(String[] args){
        StocksObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver obs1 = new EmailAlertObserverImpl("aksh@gmail.com" , iphoneObservable);
        // email alert which is subscribed to iphone Observable
        NotificationAlertObserver obs2 = new MobileAlertObserverImpl("9430" , iphoneObservable);
        // mobile alert which is subscribed to iphone Observable

        iphoneObservable.add(obs1);
        iphoneObservable.add(obs2);

        iphoneObservable.setStockCount(5);

        iphoneObservable.setStockCount(10); // this is not notify as - stock count != 0



    }
}
