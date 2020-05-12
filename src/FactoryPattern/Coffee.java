package FactoryPattern;

public abstract class Coffee {
    public String description ;
    public Size size;

    protected double cost;
    public abstract String getDescription();
    public abstract double getCost();
    public abstract Size getSize();
}
