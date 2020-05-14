package PizzaStoreFactoryPattern;

public class PizzaOrderingApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CaliPizzaStore("cheese");
        pizzaStore.orderPizza();

        pizzaStore = new NyPizzaStore("cheese");
        pizzaStore.orderPizza();

        pizzaStore = new ChicagoPizzaStore("pepperoni");
        pizzaStore.orderPizza();
    }
}
