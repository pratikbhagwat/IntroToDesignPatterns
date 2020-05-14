package PizzaStoreFactoryPattern;

public class PizzaOrderingApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore("cheese");

        pizzaStore.orderPizza();

    }
}
