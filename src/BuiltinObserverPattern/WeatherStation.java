package BuiltinObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayCurrentWeather displayCurrentWeather = new DisplayCurrentWeather(weatherData);

        weatherData.setMeasurements(40,40,100);
    }
}
