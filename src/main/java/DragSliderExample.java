import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
 

public class DragSliderExample {

    public void dragSlider(WebDriver driver) {
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        // Switch to the frame containing the slider
        driver.switchTo().frame(0);

        WebElement sliderHandle = driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
        Actions actions = new Actions(driver);

        // Drag the slider by specific x and y offset values
        actions.dragAndDropBy(sliderHandle, 10, 100).perform();
    }

}
