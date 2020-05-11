package DecoratorPattern;

public abstract class Beverage {
    public String description ;
    public Size size;

    protected double cost;
    public abstract String getDescription();
    public abstract double getCost();
    public abstract Size getSize();
}
