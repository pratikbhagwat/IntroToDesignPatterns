package PizzaStoreFactoryPattern;

import java.util.ArrayList;

public class NyPizzaIngredientFactory  implements  PizzaIngredientFactory{
    final String name = "NY";
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
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
