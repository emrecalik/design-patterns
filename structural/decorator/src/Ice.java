public class Ice extends IngredientDecorator{

    private final Coffee coffee;

    public Ice(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + Ice";
    }
}
