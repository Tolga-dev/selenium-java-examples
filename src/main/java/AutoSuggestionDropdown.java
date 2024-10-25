import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSuggestionDropdown {


    public void Run(WebDriver driver) {
		
        driver.get("https://www.yatra.com/");
        driver.findElement(By.xpath(
            "//*[@id=\"__next\"]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]"))
            .click();

        sleep(1000);

        WebElement source =driver.findElement(By.xpath("//*[@id=\"input-with-icon-adornment\"]"));
        source .click();
        sleep(1000);
        source.sendKeys("SIDNEY");
        sleep(1000);
        source.sendKeys(Keys.ARROW_DOWN);
        sleep(1000);
        source.sendKeys(Keys.ENTER);
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
