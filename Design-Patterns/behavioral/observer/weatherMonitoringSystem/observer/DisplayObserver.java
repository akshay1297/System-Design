package behavioral.observer.weatherMonitoringSystem.observer;

public interface DisplayObserver {

    void updatePressure();

    void updateHumidity();

    void updateTemprature();
}
