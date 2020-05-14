package PizzaStoreFactoryPattern;

public class CaliPizzaStore extends PizzaStore {
    public CaliPizzaStore(String type) {
        super(type);
    }

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new CheesePizza(new CaliPizzaIngredientFactory());
        }else if (type.equals("pepperoni")){
            return new PepperoniPizza(new CaliPizzaIngredientFactory());
        }
        return null;
    }
}
