package PizzaStoreFactoryPattern;

public class PizzaOrderingApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CaliPizzaStore("cheese");

        pizzaStore.orderPizza();

    }
}
