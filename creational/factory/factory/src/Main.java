import pizzaStore.ChicagoPizzaStore;
import pizzaStore.MiamiPizzaStore;
import pizzaStore.PizzaStore;
import pizzaStore.PizzaType;

public class Main {
    public static void main(String[] args) {
        PizzaStore miamiPizzaStore = new MiamiPizzaStore();
        miamiPizzaStore.orderPizza(PizzaType.VEGGIE);
        miamiPizzaStore.orderPizza(PizzaType.MUSHROOM);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
