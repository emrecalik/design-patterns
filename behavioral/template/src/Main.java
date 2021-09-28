public class Main {
    public static void main(String[] args) {
        CarDriveTemplate electricalCar = new ElectricalCar();
        electricalCar.driveCar();

        CarDriveTemplate traditionalCar = new TraditionalCar();
        traditionalCar.driveCar();
    }
}
