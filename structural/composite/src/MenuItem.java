public class MenuItem extends MenuComponent{

    private final String name;

    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Name = " + this.name + " -- Price = " + this.price);
    }
}
