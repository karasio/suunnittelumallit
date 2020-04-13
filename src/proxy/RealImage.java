package proxy;

import java.io.FileInputStream;
import java.util.Properties;

class RealImage implements Image {
    private final String filename;
    private String photo;
    private String name;

    public RealImage(String filename, String name) {
        this.filename = filename;
        this.name = name;
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

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    public void displayImage() {
        System.out.println(photo);
    }

    @Override
    public String showData() {
        return name;
    }
}