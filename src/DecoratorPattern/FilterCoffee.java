package DecoratorPattern;

public class FilterCoffee extends Beverage{
    public FilterCoffee(Size size){
        this.size = size;
        this.cost = 10 * this.size.factorOfMultiplicationOnBaseCost;
        this.description = "Filter Coffee";
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public Size getSize() {
        return this.size;
    }
}
