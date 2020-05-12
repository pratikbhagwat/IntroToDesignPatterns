package FactoryPattern;

public abstract class ComponentDecorator extends Coffee {
    public Coffee beverage;

    public  ComponentDecorator(Coffee beverage){
        this.beverage = beverage;
    }
    public Size getSize(){
        return this.beverage.getSize();
    }
}
