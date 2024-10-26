import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.setProperty("webdriver.chrome.driver", "/home/xamblot/Desktop/SeleniumWithJava/selenium/chromedriver");
        
        WebDriver driver = new ChromeDriver();
    }

}
