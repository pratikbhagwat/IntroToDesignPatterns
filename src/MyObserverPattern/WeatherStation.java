package MyObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayCurrentConditions displayCurrentConditions = new DisplayCurrentConditions(weatherData);
        DisplayHeatIndex displayHeatIndex = new DisplayHeatIndex(weatherData);

        weatherData.setMeasurements(40,100,200);
        weatherData.setMeasurements(40,100,200);

        weatherData.setMeasurements(40,100,200);

    }
}
