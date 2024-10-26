import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResizeElementExample {

    public void resizeElement(WebDriver driver) {
        driver.get("https://demoqa.com/resizable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement resizeHandle = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
        Actions actions = new Actions(driver);

        // Drag the resizable element's handle to resize it
        actions.dragAndDropBy(resizeHandle, 100, 50).perform();
    }
}
