package pizza;

public class ChicagoCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Chicago Cheese Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Cheese Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Cheese Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Chicago Cheese Pizza - Boxing..");
    }
}
