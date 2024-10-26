package Examples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;

public class DropDown{

    public void Run(WebDriver driver) {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    
        WebElement dropdownElement = findDropdown(driver);
        Select dropdown = new Select(dropdownElement);
        
        selectOptionByIndex(dropdown, 1);
        printSelectedOption(dropdown);
        
        selectOptionByValue(dropdown, "1");
        selectOptionByVisibleText(dropdown, "Two");
    
        printAllOptions(dropdown);
        deselectAllOptions(dropdown);
    }
    
    private WebElement findDropdown(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));
    }
    
    private void selectOptionByIndex(Select dropdown, int index) {
        dropdown.selectByIndex(index);
        sleep(1000);
    }
    
    private void selectOptionByValue(Select dropdown, String value) {
        dropdown.selectByValue(value);
        sleep(1000);
    }
    
    private void selectOptionByVisibleText(Select dropdown, String text) {
        dropdown.selectByVisibleText(text);
        sleep(1000);
    }
    
    private void printSelectedOption(Select dropdown) {
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());
    }
    
    private void printAllOptions(Select dropdown) {
        List<WebElement> options = dropdown.getOptions();
        System.out.println("Available Options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    
    private void deselectAllOptions(Select dropdown) {
        dropdown.deselectAll();
        sleep(1000);
    }
    
    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
