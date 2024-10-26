import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FindProductsAndClickOrder 
{
    public void Run( String[] args ) throws InterruptedException, IOException
    {
        System.setProperty("webdriver.chrome.driver", "/home/xamblot/Desktop/SeleniumWithJava/selenium/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            List<String> targetProducts = Arrays.asList("Pumpkin");

            addProductsToCart(driver, targetProducts);
            proceedToCheckout(driver);
            placeOrder(driver, "India");

        } finally {
            
        }
    }

    // Adds specified products to the cart
    private static void addProductsToCart(WebDriver driver, List<String> productNames) throws InterruptedException {
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        
        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getText().split("-")[0].trim();
            if (productNames.contains(productName)) {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                Thread.sleep(2000);  // Pause to ensure each click registers
            }
        }
    }

    // Navigates to the cart and starts checkout process
    private static void proceedToCheckout(WebDriver driver) {
        WebElement cartIcon = driver.findElement(By.xpath("//a/img[@alt='Cart']"));
        cartIcon.click();

        WebElement checkoutButton = driver.findElement(By.cssSelector(".action-block"));
        checkoutButton.click();
    }

    // Selects the country, agrees to terms, and proceeds to complete the order
    private static void placeOrder(WebDriver driver, String country) {
        driver.findElement(By.xpath("//button[contains(.,'Place Order')]")).click();

        // Select country from dropdown
        WebElement countryDropdown = driver.findElement(By.tagName("select"));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText(country);

        // Agree to terms and conditions
        WebElement termsCheckbox = driver.findElement(By.tagName("input"));
        termsCheckbox.click();

        // Finalize the order by clicking 'Proceed'
        WebElement proceedButton = driver.findElement(By.tagName("button"));
        proceedButton.click();
    }

}
