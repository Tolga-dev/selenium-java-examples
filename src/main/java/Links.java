import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Links {

    public void Run(WebDriver driver) {
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        sleep(1000);
        
        // Accept cookies
        acceptCookies(driver);
        // Print all option tags
       // printAllOptionTags(driver);

        // Print options from "how-select" dropdown
     //   printDropdownOptions(driver);
    }

    private void acceptCookies(WebDriver driver) {
        WebElement cookieButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cookieButton.click();
        sleep(500);
    }

    private void printAllOptionTags(WebDriver driver) {
        List<WebElement> allOptions = driver.findElements(By.tagName("option"));
        System.out.println("Total <option> tags found: " + allOptions.size());

        for (WebElement option : allOptions) {
            System.out.println("Value: " + option.getAttribute("value"));
            System.out.println("Text: " + option.getText());
        }
    }

    private void printDropdownOptions(WebDriver driver) {
        WebElement dropdownElement = driver.findElement(By.id("how-select"));
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        System.out.println("Total options in 'how-select' dropdown: " + options.size());
        for (WebElement option : options) {
            System.out.println("Value: " + option.getAttribute("value"));
        }
    }

    private void findAllLinksWithTagName(WebDriver driver) {
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement link : allLinks) {
            System.out.println("Link href: " + link.getAttribute("href"));
            System.out.println("Link text: " + link.getText());
        }
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
