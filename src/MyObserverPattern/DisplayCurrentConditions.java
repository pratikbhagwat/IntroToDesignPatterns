package MyObserverPattern;

public class DisplayCurrentConditions implements Observer , DisplayElement {

    private WeatherData weatherDataObject;
    private double pressure;
    private double temperature;

    public DisplayCurrentConditions(WeatherData weatherDataObject){
        this.weatherDataObject = weatherDataObject;
        this.weatherDataObject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("DisplayCurrentConditions   temperature = " + this.temperature + " Pressure = " + this.pressure);
    }


    @Override
    public void update() {
        this.pressure = this.weatherDataObject.getPressure();
        this.temperature = this.weatherDataObject.getTemperature();
        display();
    }

}
