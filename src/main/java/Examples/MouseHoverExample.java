package Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MouseHoverExample {

    public void performMouseHover(WebDriver driver) {
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement mouseHoverElement = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverElement).perform();

        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(4))
            .pollingEvery(Duration.ofSeconds(2))
            .withMessage("Element not found");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[4]/a"))).click();
    }
}
