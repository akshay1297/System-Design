package behavioral.observer.weatherMonitoringSystem.observer;

import behavioral.observer.weatherMonitoringSystem.observable.WeatherUpdateObservable;

public class WebDashboardObserver implements DisplayObserver{


    WeatherUpdateObservable weatherUpdateObservable;

    public WebDashboardObserver(WeatherUpdateObservable weatherUpdateObservable) {
        this.weatherUpdateObservable = weatherUpdateObservable;
    }

    @Override
    public void updatePressure() {
        System.out.println("Pressure is updated in Web Dashboards with : " + weatherUpdateObservable.getPressure());

    }

    @Override
    public void updateHumidity() {
        System.out.println("Humidity is updated in Web Dashboards with : " + weatherUpdateObservable.getHumidity());
    }

    @Override
    public void updateTemprature() {
        System.out.println("Temprature is updated in Web Dashboards with : " + weatherUpdateObservable.getTemprature());

    }
}
