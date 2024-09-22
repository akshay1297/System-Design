package behavioral.observer.weatherMonitoringSystem;

import behavioral.observer.weatherMonitoringSystem.observable.WeatherUpdateObservable;
import behavioral.observer.weatherMonitoringSystem.observable.WeatherUpdateObservableImpl;
import behavioral.observer.weatherMonitoringSystem.observer.LedBoardsObserver;
import behavioral.observer.weatherMonitoringSystem.observer.MobileAppsObserver;

public class WeatherStation {
    public static void main(String[] args){

        WeatherUpdateObservable weatherUpdateObservable =  new WeatherUpdateObservableImpl();
        // add observer
        weatherUpdateObservable.addObserver(new LedBoardsObserver(weatherUpdateObservable));
        // set only humidity
       weatherUpdateObservable.setHumidity(2.2);
        weatherUpdateObservable.setHumidity(2.2);



        // add Mobile apps observer
//        weatherUpdateObservable.addObserver(new MobileAppsObserver(weatherUpdateObservable));
//        weatherUpdateObservable.setHumidity(2.2);
//        weatherUpdateObservable.setPressure(2.3);
//        weatherUpdateObservable.setTemprature(22.3);

    }
}
