package Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPop {
    public static void Run(WebDriver driver)
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
		
        String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());

        driver.close();
    }

}
