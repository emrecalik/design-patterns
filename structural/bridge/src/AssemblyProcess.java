public class AssemblyProcess extends Process {

    @Override
    public void doWork(Vehicle vehicle) {
        final int processTimeRatio = 3;
        System.out.println("Assembly Process takes " + vehicle.processTime() * processTimeRatio + " hours.");
    }
}
