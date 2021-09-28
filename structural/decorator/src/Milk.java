public class Milk extends IngredientDecorator{

    private final Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + Milk";
    }
}
