package Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RatioRun {

    public void Run(WebDriver driver)
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
        var radio = driver.findElement(By.xpath("//*[@id=\"male\"]"));
        radio.click();
    }
}
