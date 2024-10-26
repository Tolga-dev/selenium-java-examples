import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public void useExplicitWait(WebDriver driver) {
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement mouseHoverElement = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverElement).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/div[2]/div[1]/nav[2]/ul/li[4]/a"))).click();
    }
}
