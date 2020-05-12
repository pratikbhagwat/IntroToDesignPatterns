package FactoryPattern;

public class StarBuzzBandra extends CoffeeFactory {
    double locationTax = 0.30;
    public StarBuzzBandra(int coffeeType , int coffeeSize) {
        super(coffeeType,coffeeSize);
    }

    @Override
    public Coffee createCoffee() throws Exception {
        Coffee coffee ;
        if (this.coffeeType == 1){
            if (this.coffeeSize == 1){
                coffee = new FilterCoffee(new Tall());
            }else if (this.coffeeSize ==2){
                coffee =  new FilterCoffee(new Grande());
            }else if (this.coffeeSize ==3){
                coffee =  new FilterCoffee(new Venti());
            }else throw new Exception("Put correct size of coffee");

        }else if (this.coffeeType == 2){
            if (this.coffeeSize == 1){
                coffee =  new HouseBlend(new Tall());
            }else if (this.coffeeSize ==2){
                coffee =  new HouseBlend(new Grande());
            }else if (this.coffeeSize ==3){
                coffee =  new HouseBlend(new Venti());
            }else throw new Exception("Put correct size of coffee");

        }else throw new Exception("Enter correct coffeeType");
        coffee.cost += coffee.cost * this.locationTax;
        return coffee;
    }
}
