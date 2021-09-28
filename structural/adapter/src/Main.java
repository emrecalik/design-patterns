public class Main {
    public static void main(String[] args) {
        Movable ferrari = new Ferrari();
        MovableAdapter ferrariAdapter = new MovableAdapterImpl(ferrari);
        System.out.println(ferrariAdapter.getSpeedInKmh());

        Movable ford = new Ford();
        MovableAdapter fordAdapter = new MovableAdapterImpl(ford);
        System.out.println(fordAdapter.getSpeedInKmh());
    }
}
