public class Main {

    public static void main(String[] args) {
        Image imageService = new ImageProxy("https://www.image.com/images/1");
        imageService.display();
        imageService.display();
    }
}
