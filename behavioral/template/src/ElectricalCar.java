public class ElectricalCar extends CarDriveTemplate{
    @Override
    void startPowerUnit() {
        System.out.println("Electric engine is starting...");
    }

    @Override
    void stopPowerUnit() {
        System.out.println("Electric engine is stopping...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery is being charged...");
    }
}
