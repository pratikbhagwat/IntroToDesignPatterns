package PizzaStoreFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(String type) {
        super(type);
    }

    @Override
    public Pizza createPizza(String type) {
        if (type.equals( "cheese" )){
            return new CheesePizza(new ChicagoPizzaIngredientFactory());
        }
        else if (type.equals("pepperoni")){
            return new PepperoniPizza(new ChicagoPizzaIngredientFactory());
        }return null;
    }
}
