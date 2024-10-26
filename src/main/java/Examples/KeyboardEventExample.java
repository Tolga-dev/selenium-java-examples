package Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventExample {

    public void copyPasteText(WebDriver driver) throws InterruptedException {
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();

        WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
        WebElement destinationElement = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));

        Actions actions = new Actions(driver);
        actions.keyDown(sourceElement, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(1000);
        actions.keyDown(destinationElement, Keys.CONTROL).sendKeys("a").sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    }
}
