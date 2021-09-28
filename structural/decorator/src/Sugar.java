public class Sugar extends IngredientDecorator{

    private final Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 1.25;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + Sugar";
    }
}
