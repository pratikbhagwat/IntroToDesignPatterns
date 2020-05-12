package FactoryPattern;

public abstract class CoffeeFactory {
    int coffeeType;
    int coffeeSize;
    public CoffeeFactory( int coffeeType,int coffeeSize){
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
    }
    public final Coffee orderCoffee() throws Exception {
        Coffee coffee = createCoffee();
        coffee.brew();
//        coffee.transferToCup();
//        coffee.addStraw();
        return coffee;
    }



    public abstract Coffee createCoffee() throws Exception;
}
