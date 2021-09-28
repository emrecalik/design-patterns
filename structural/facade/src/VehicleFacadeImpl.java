public class VehicleFacadeImpl implements VehicleFacade {
    private Engine engine;

    private VehicleControl vehicleControl;

    public VehicleFacadeImpl(Engine engine, VehicleControl vehicleControl) {
        this.engine = engine;
        this.vehicleControl = vehicleControl;
    }

    @Override
    public void runEngine() {
        engine.triggerEcu();
        engine.runSensors();
        engine.run();
    }

    @Override
    public void moveVehicle() {
        vehicleControl.stepOnAcceleratorPedal();
        vehicleControl.rollWheels();
    }

    @Override
    public void stopVehicle() {
        vehicleControl.stepOffAcceleratorPedal();
        vehicleControl.stepOnBrake();
        vehicleControl.stopVehicle();
    }
}
