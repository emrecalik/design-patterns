public class Latte extends Coffee {

    public Latte() {
        setDescription("Latte");
    }

    @Override
    public double cost() {
        return 15;
    }
}
