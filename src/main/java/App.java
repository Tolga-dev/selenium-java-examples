import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;


public class App 
{


    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/home/xamblot/Desktop/SeleniumWithJava/selenium/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        DropDown down = new DropDown();
        ElementMethods methods = new ElementMethods();
        Links links = new Links();


        // methods.Run(driver);

        // down.Run(driver);

        links.Run(driver);
    }



}
