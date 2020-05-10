package BuiltinObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private double temperature;
    private double pressure;
    private double humidity;

    private void measurementsChanged(){
        this.setChanged();
        this.notifyObservers();
    }

    public void setMeasurements(int temperature , int pressure , int humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
