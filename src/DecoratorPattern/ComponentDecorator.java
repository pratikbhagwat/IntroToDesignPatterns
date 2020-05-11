package DecoratorPattern;

public abstract class ComponentDecorator extends Beverage {
    public Beverage beverage;

    public  ComponentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    public Size getSize(){
        return this.beverage.getSize();
    }
}
