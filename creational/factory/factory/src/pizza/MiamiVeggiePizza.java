package pizza;

public class MiamiVeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Miami Veggie Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Miami Veggie Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Miami Veggie Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Miami Veggie Pizza - Boxing..");
    }
}
