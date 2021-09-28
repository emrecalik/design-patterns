public class Main {
    public static void main(String[] args) {
        AbstractFactory swimmingAnimalFactory = FactoryProvider.getFactory(AnimalType.SWIMMING);
        if (swimmingAnimalFactory != null) {
            Animal fish = swimmingAnimalFactory.getAnimal("Fish");
            System.out.println(fish.getAnimalName());
        }

        AbstractFactory flyingAnimalFactory = FactoryProvider.getFactory(AnimalType.FLYING);
        if (flyingAnimalFactory != null) {
            Animal bee = flyingAnimalFactory.getAnimal("Bee");
            System.out.println(bee.getAnimalName());
        }
    }
}
