import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

    public void rightClickOnElement(WebDriver driver) {
        driver.get("https://jqueryui.com/slider/#colorpicker");

        WebElement box = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
        Actions actions = new Actions(driver);

        // Right-click on the element
        actions.contextClick(box).perform();
    }
}
