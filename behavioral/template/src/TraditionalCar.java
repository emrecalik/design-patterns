public class TraditionalCar extends CarDriveTemplate{

    @Override
    void startPowerUnit() {
        System.out.println("Internal combustion engine is starting...");
    }

    @Override
    void stopPowerUnit() {
        System.out.println("Internal combustion engine is stopping...");
    }
}
