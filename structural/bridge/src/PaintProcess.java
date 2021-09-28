public class PaintProcess extends Process {

    @Override
    public void doWork(Vehicle vehicle) {
        final int processTimeRatio = 2;
        System.out.println("Paint Process takes " + vehicle.processTime() * processTimeRatio + " hours.");
    }
}
