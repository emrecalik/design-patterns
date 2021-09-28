import java.util.Objects;

public class SwimmingAnimalFactory implements AbstractFactory {
    @Override
    public Animal getAnimal(String animalName) {

        if (Objects.equals(animalName, "Fish")) {
            return new Fish();
        } else if (Objects.equals(animalName, "Frog")) {
            return new Frog();
        } else if (Objects.equals(animalName, "Penguin")) {
            return new Penguin();
        } else {
            return null;
        }
    }
}
