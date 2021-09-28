public class Main {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.addProcess(new ManufactureProcess());
        bike.addProcess(new AssemblyProcess());
        bike.addProcess(new PaintProcess());
        bike.produce();

        Vehicle car = new Car();
        car.addProcess(new ManufactureProcess());
        car.addProcess(new AssemblyProcess());
        car.addProcess(new PaintProcess());
        car.produce();

        Vehicle bus = new Bus();
        bus.addProcess(new ManufactureProcess());
        bus.addProcess(new AssemblyProcess());
        bus.addProcess(new PaintProcess());
        bus.produce();
    }
}
