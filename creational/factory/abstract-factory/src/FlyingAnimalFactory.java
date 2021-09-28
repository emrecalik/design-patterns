import java.util.Objects;

public class FlyingAnimalFactory implements AbstractFactory {

    @Override
    public Animal getAnimal(String animalName) {

        if (Objects.equals(animalName, "Bee")) {
            return new Bee();
        } else if (Objects.equals(animalName, "Bird")) {
            return new Bird();
        } else if (Objects.equals(animalName, "Butterfly")) {
            return new Butterfly();
        } else {
            return null;
        }
    }
}
