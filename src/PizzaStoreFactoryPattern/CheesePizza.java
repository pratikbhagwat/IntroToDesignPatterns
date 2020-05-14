package PizzaStoreFactoryPattern;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.setName("cheesePizza of " + this.pizzaIngredientFactory.getName() );
    }
    @Override
    void prepare() {
        System.out.println("Preparing " + this.name );
        this.cheese = this.pizzaIngredientFactory.createCheese();
        this.dough = this.pizzaIngredientFactory.createDough();
        this.sauce = this.pizzaIngredientFactory.createSauce();
    }
}
