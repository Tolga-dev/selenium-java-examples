import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementMethods {

    public void Run(WebDriver driver) {
        
//        DoLoginWithMethods(driver);
//        DoLoginWithCssSelector(driver);
//       DoLoginAndGetElements(driver);
//        WebElementMethods(driver);
    }
    private static void WebElementMethods(WebDriver driver) {
        driver.get("https://saucedemo.com/"); // get google website meta

        var userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        userName.clear();

        var className = userName.getAttribute("class");
        System.out.println(className);
        
        var name = userName.getAttribute("name");
        System.out.println(name);
        

    }
    
    private static void DoLoginAndGetElements(WebDriver driver) {
        driver.get("https://saucedemo.com/"); // get google website meta

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        

        driver.findElement(By.
        xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        
        
        var webElement = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div"));
        System.out.println(webElement.getText());
    }


    private static void DoLoginWithMethods(WebDriver driver) {

        driver.get("https://saucedemo.com/"); // get google website meta

        WebElement usernameElement = driver.findElement(By.id("user-name"));
        usernameElement.sendKeys("1");

        DoLoginWithMethods(driver);

        driver.findElement(By.className("form_input")).sendKeys("2");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("3");

        // xpath=//tagname[@attribute="value"]
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("4");

        driver.findElement(By.tagName("input")).sendKeys("5");
    }
    private static void DoLoginWithCssSelector(WebDriver driver)
    {
        driver.get("https://saucedemo.com/"); // get google website meta
        driver.manage().window().maximize(); 
        driver.findElement(By.cssSelector("#user-name")).sendKeys("3");

        var currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        var title = driver.getTitle();
        System.out.println(title);

        var pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.navigate().to("https://www.google.com"); 
        driver.close();
    }
    
    
}
