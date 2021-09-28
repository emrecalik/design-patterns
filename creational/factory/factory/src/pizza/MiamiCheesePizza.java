package pizza;

import pizza.Pizza;

public class MiamiCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Miami Cheese Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Miami Cheese Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Miami Cheese Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Miami Cheese Pizza - Boxing..");
    }
}
