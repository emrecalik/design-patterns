public class FactoryProvider {

    public static AbstractFactory getFactory(AnimalType animalType) {
        if (animalType == AnimalType.FLYING) {
            return new FlyingAnimalFactory();
        } else if (animalType == AnimalType.SWIMMING) {
            return new SwimmingAnimalFactory();
        } else {
            return null;
        }
    }

}
