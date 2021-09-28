package pizza;

public class MiamiMushroomPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Miami Mushroom Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Miami Mushroom Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Miami Mushroom Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Miami Mushroom Pizza - Boxing..");
    }
}
