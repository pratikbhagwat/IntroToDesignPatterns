package MyObserverPattern;

public class DisplayHeatIndex implements Observer , DisplayElement {
    private double heatIndex;
    private WeatherData weatherDataObject;
    public DisplayHeatIndex(WeatherData weatherDataObject){
        this.weatherDataObject = weatherDataObject;
        this.weatherDataObject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Heat Index is = " + this.heatIndex);
    }

    @Override
    public void update() {
        this.heatIndex = this.weatherDataObject.getHumidity()+ this.weatherDataObject.getTemperature();
        display();
    }
}
