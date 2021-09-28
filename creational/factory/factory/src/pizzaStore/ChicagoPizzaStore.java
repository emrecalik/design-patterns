package pizzaStore;

import pizza.ChicagoCheesePizza;
import pizza.ChicagoMushroomPizza;
import pizza.ChicagoVeggiePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType pizzaType) {

        if (pizzaType == PizzaType.CHEESE) {
            return new ChicagoCheesePizza();
        } else if (pizzaType == PizzaType.MUSHROOM) {
            return new ChicagoMushroomPizza();
        } else if (pizzaType == PizzaType.VEGGIE) {
            return new ChicagoVeggiePizza();
        } else {
            return null;
        }
    }
}
