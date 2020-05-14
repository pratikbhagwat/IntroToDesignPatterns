package PizzaStoreFactoryPattern;

public abstract class PizzaStore {
    String type;
    public PizzaStore(String type){
        this.type = type;
    }

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(){
        Pizza pizza = createPizza(this.type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
