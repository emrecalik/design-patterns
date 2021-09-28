public class Main {
    public static void main(String[] args) {
        VehicleFacade vehicleFacade = new VehicleFacadeImpl(new Engine(), new VehicleControl());
        vehicleFacade.runEngine();
        vehicleFacade.moveVehicle();
        vehicleFacade.stopVehicle();
    }
}
