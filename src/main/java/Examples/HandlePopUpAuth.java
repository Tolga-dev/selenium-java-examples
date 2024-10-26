package Examples;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HandlePopUpAuth {

    public void HandleAuthPopup(WebDriver driver) {
        String username = "admin";
        String password = "admin";
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
    }
    
}

