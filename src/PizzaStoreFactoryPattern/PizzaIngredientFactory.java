package PizzaStoreFactoryPattern;

import java.util.ArrayList;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public ArrayList<Veggies> createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
    public String getName();
}
