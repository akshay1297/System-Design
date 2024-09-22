package behavioral.observer.weatherMonitoringSystem.observer;

import behavioral.observer.weatherMonitoringSystem.observable.WeatherUpdateObservable;

public class MobileAppsObserver implements DisplayObserver{
    WeatherUpdateObservable weatherUpdateObservable;

    public MobileAppsObserver(WeatherUpdateObservable weatherUpdateObservable) {
        this.weatherUpdateObservable = weatherUpdateObservable;
    }

    @Override
    public void updatePressure() {
        System.out.println("Pressure is updated in Mobile apps with : " + weatherUpdateObservable.getPressure());

    }

    @Override
    public void updateHumidity() {
        System.out.println("Humidity is updated in Mobile apps with : " + weatherUpdateObservable.getHumidity());

    }

    @Override
    public void updateTemprature() {
        System.out.println("Temprature is updated in Mobile apps with : " + weatherUpdateObservable.getTemprature());

    }
}
