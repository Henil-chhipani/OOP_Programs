package ProxyPattern;

interface ImageLoader {
    void display();
}

// Real Subject Implementation: HighResolutionImageLoader
class HighResolutionImageLoader implements ImageLoader {
    private String imageUrl;

    public HighResolutionImageLoader(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImage(); // Simulating image loading
    }

    private void loadImage() {
        System.out.println("Loading high-resolution image from " + imageUrl);
    }

    @Override
    public void display() {
        System.out.println("Displaying high-resolution image from " + imageUrl);
    }
}

// Proxy: ProxyImageLoader
class ProxyImageLoader implements ImageLoader {
    private HighResolutionImageLoader realImage;
    private String imageUrl;

    public ProxyImageLoader(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImageLoader(imageUrl);
        }
        realImage.display();
    }
}

public class ProxyPattern2 {

    public static void main(String[] args) {
        // Using the real subject directly
        ImageLoader realImage = new HighResolutionImageLoader("https://example.com/highresimage.jpg");
        realImage.display();

        System.out.println();

        // Using the proxy
        ImageLoader proxyImage = new ProxyImageLoader("https://example.com/highresimage.jpg");
        proxyImage.display();
    }
}
