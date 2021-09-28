public abstract class CarDriveTemplate {

    final void driveCar() {
        startPowerUnit();
        moveCar();
        brake();
        parkCar();
        stopPowerUnit();
        chargeBattery();
    }

    abstract void startPowerUnit();

    abstract void stopPowerUnit();

    private void moveCar() {
        System.out.println("Car is moving...");
    }

    private void brake() {
        System.out.println("Car is slowing down...");
    }

    private void parkCar() {
        System.out.println("Car is being parked...");
    }

    public void chargeBattery() { };
}
