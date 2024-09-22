package behavioral.observer.weatherMonitoringSystem.observable;

import behavioral.observer.weatherMonitoringSystem.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherUpdateObservableImpl implements WeatherUpdateObservable{
    private Double temprature = 0.0;
    private Double humidity = 0.0;
    private Double pressure = 0.0;

    private List<DisplayObserver> observerList = new ArrayList<>();


    @Override
    public void addObserver(DisplayObserver displayObserver) {
        this.observerList.add(displayObserver);
    }

    @Override
    public void removeObserver(DisplayObserver displayObserver) {
        this.observerList.remove(displayObserver);
    }

//    @Override
//    public void setWeatherData(Double temprature, Double humidity, Double pressure) {
//        if(!this.temprature.equals(temprature)){
//            this.temprature = temprature;
//            notifyObserver();
//        }
//
//        if(!this.humidity.equals(humidity)){
//            this.humidity = humidity;
//            notifyObserver();
//        }
//
//        if(!this.pressure.equals(pressure)){
//            this.pressure = pressure;
//            notifyObserver();
//        }
//    }


    public Double getTemprature() {
        return temprature;
    }

    public void setTemprature(Double temprature) {
        if(!this.temprature.equals(temprature)) {
            this.temprature = temprature;
            for (DisplayObserver observer : observerList) {
                observer.updateTemprature();
            }
        }
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        if(!this.humidity.equals(humidity)) {
            this.humidity = humidity;
            for (DisplayObserver observer : observerList) {
                observer.updateHumidity();
            }
        }
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        if(!this.pressure.equals(pressure)) {
            this.pressure = pressure;
            for (DisplayObserver observer : observerList) {
                observer.updatePressure();
            }
        }
    }
}
