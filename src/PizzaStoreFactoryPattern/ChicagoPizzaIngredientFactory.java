package PizzaStoreFactoryPattern;

import java.util.ArrayList;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    final String name = "Chicago";
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoDeepDishSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozCheese();
    }

    @Override
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggiesArrayList = new ArrayList<>();
        veggiesArrayList.add(new Garlic());
        veggiesArrayList.add(new Onion());
        veggiesArrayList.add(new MushRoom());
        veggiesArrayList.add(new RedPepper());
        return  veggiesArrayList;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public String getName() {
        return name;
    }
}
