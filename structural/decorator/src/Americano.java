public class Americano extends Coffee{

    public Americano() {
        setDescription("Americano");
    }

    @Override
    public double cost() {
        return 12;
    }
}
