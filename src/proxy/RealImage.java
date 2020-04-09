package proxy;

import singleton.GameCharacterFactory;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

// On System A
class RealImage implements Image {
    private final String filename;
    private String photo;

    /**
     * Constructor
     *
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        // get corresponding photo from properties
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./src/proxy/properties"));
        } catch (Exception e) {
            System.out.println("FILE read does not work");
            e.printStackTrace();
        }
        try {
            photo = properties.getProperty(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println(photo);
    }

    @Override
    public String showData() {
        return null;
    }
}