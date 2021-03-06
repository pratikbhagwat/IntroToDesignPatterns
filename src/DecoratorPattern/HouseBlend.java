package DecoratorPattern;

public class HouseBlend extends Coffee {
    public HouseBlend(Size size){
        this.size = size;
        this.cost = 10 * this.size.factorOfMultiplicationOnBaseCost;
        this.description = "house blend";
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
