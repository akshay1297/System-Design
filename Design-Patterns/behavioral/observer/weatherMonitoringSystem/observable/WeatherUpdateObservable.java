package behavioral.observer.weatherMonitoringSystem.observable;

import behavioral.observer.weatherMonitoringSystem.observer.DisplayObserver;

public interface WeatherUpdateObservable {
     void addObserver(DisplayObserver displayObserver);
        void removeObserver(DisplayObserver displayObserver);
     Double getTemprature();

     Double getHumidity();
     void setHumidity(Double humidity);

    Double getPressure();

}
