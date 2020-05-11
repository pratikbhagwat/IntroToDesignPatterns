package DecoratorPattern;

public class Mocha extends ComponentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        this.description = this.beverage.getDescription() + " Mocha";
        this.cost = this.beverage.getCost()+0.1*this.beverage.size.factorOfMultiplicationOnBaseCost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return  this.cost;
    }
}
