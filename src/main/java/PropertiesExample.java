import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

    public void loadAndModifyProperties() throws IOException {
        Properties prop = new Properties();
        String path = "src/main/java/prop.Properties";

        // Load properties file
        FileInputStream fis = new FileInputStream(path);
        prop.load(fis);
        fis.close();

        System.out.println("Browser: " + prop.getProperty("browser"));
        System.out.println("URL: " + prop.getProperty("url"));

        // Modify property
        FileOutputStream fos = new FileOutputStream(path);
        prop.setProperty("testdata", "29839937937");
        prop.store(fos, "Updated testdata property");
        fos.close();
    }
}
