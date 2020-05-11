package DecoratorPattern;

public class Milk extends ComponentDecorator{
    public Milk(Beverage beverage){
        super(beverage);
        this.description = this.beverage.description+ " Milk";
        this.cost = this.beverage.getCost() + 0.1*this.beverage.getSize().factorOfMultiplicationOnBaseCost;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
