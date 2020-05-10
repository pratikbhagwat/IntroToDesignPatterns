package MyObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    private Set<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        this.observers = new HashSet<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            this.observers.remove(observer);
        }
    }
    private void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(int temperature , int pressure , int humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }
}
