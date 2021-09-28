public class Main {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        americano = new Sugar(americano);
        americano = new Milk(americano);
        System.out.println(americano.getDescription());
    }
}
