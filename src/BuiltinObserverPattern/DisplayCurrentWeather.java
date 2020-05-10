package BuiltinObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DisplayCurrentWeather implements Observer , DisplayElement {

    private Observable observable ;
    private double temperature;
    private double pressure;


    public DisplayCurrentWeather(Observable observable){
        this.observable=observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("Temperature = " + this.temperature + " Pressure = "+this.pressure);
    }
}
