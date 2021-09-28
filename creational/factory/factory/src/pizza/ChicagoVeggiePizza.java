package pizza;

public class ChicagoVeggiePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Chicago Veggie Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Veggie Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Veggie Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Chicago Veggie Pizza - Boxing..");
    }
}
