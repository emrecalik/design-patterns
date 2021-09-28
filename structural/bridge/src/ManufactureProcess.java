public class ManufactureProcess extends Process {
    @Override
    public void doWork(Vehicle vehicle) {
        final int processTimeRatio = 4;
        System.out.println("Manufacture Process takes " + vehicle.processTime() * processTimeRatio + " hours.");
    }
}
