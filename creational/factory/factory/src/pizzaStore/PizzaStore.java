package pizzaStore;

import pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(PizzaType pizzaType) {

        Pizza pizza;

        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(PizzaType pizzaType);
}
