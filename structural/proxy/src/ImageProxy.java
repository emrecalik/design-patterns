public class ImageProxy implements Image{

    private final String imageUrl;

    private Image image;

    public ImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (this.image == null) {
            this.image = new ImageService(this.imageUrl);
        }
        this.image.display();
    }
}
