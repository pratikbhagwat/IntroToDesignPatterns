package PizzaStoreFactoryPattern;

public class NyPizzaStore extends PizzaStore {
    public NyPizzaStore(String type) {
        super(type);
    }

    @Override
    public Pizza createPizza(String type) {
        if ( type.equals( "cheese" )){
            return new CheesePizza(new NyPizzaIngredientFactory());
        }else if (type.equals( "pepperoni" )){
            return new PepperoniPizza(new NyPizzaIngredientFactory());
        }
        return null;
    }
}
