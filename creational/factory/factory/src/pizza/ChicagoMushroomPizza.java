package pizza;

public class ChicagoMushroomPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Chicago Mushroom Pizza - Preparing..");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Mushroom Pizza - Baking..");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Mushroom Pizza - Cutting..");
    }

    @Override
    public void box() {
        System.out.println("Chicago Mushroom Pizza - Boxing..");
    }
}
