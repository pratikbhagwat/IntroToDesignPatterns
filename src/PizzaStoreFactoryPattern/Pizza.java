package PizzaStoreFactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<Veggies> veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;


    abstract void prepare();

    public void bake() {
        System.out.println("Pizza baking");
    }

    public void cut() {
        System.out.println("Pizza Cutting");
    }

    public void box() {
        System.out.println("Pizza putting in the box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
