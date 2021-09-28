public class ImageService implements Image{

    private final String imageUrl;

    public ImageService(String imageUrl) {
        this.imageUrl = imageUrl;
        fetchFromInternet();
    }

    private void fetchFromInternet() {
        System.out.println("Image is being fetched from " + this.imageUrl);
    }

    @Override
    public void display() {
        System.out.println("Image is being displayed.");
    }
}
