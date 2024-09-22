package behavioral.observer.weatherMonitoringSystem.observer;

import behavioral.observer.weatherMonitoringSystem.observable.WeatherUpdateObservable;

public class LedBoardsObserver implements DisplayObserver{

    WeatherUpdateObservable weatherUpdateObservable;

    public LedBoardsObserver(WeatherUpdateObservable weatherUpdateObservable) {
        this.weatherUpdateObservable = weatherUpdateObservable;
    }

    @Override
    public void updatePressure() {
        System.out.println("Pressure is updated in LED Board with : " + weatherUpdateObservable.getPressure());
    }

    @Override
    public void updateHumidity() {
        System.out.println("Humidity is updated in LED Board with : " + weatherUpdateObservable.getHumidity());

    }

    @Override
    public void updateTemprature() {
        System.out.println("Temprature is updated in LED Board with : " + weatherUpdateObservable.getTemprature());

    }
}
