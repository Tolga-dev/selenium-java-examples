import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    
    private static void Run(WebDriver driver) {

        driver.get("https://www.ebay.com/");

        WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]"));

		Actions action = new Actions(driver);
		action.moveToElement(firstelement).perform();// perform operation is must to execute before executing build()
    }

}
