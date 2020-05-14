package PizzaStoreFactoryPattern;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.setName("PepperoniPizza of " + this.pizzaIngredientFactory.getName() );
    }
    @Override
    void prepare() {
        System.out.println("Preparing " + this.name);
        this.cheese = this.pizzaIngredientFactory.createCheese();
        this.dough = this.pizzaIngredientFactory.createDough();
        this.sauce = this.pizzaIngredientFactory.createSauce();
    }
}
