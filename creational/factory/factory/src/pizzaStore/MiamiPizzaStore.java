package pizzaStore;

import pizza.MiamiCheesePizza;
import pizza.MiamiMushroomPizza;
import pizza.MiamiVeggiePizza;
import pizza.Pizza;

public class MiamiPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.CHEESE) {
            return new MiamiCheesePizza();
        } else if (pizzaType == PizzaType.MUSHROOM) {
            return new MiamiMushroomPizza();
        } else if (pizzaType == PizzaType.VEGGIE) {
            return new MiamiVeggiePizza();
        } else {
            return null;
        }
    }
}
