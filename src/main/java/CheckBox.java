import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

    public void run(WebDriver driver) {
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        sleep(2000);

        WebElement confirmBox = driver.findElement(By.id("ConfirmBox"));
        scrollToElement(driver, confirmBox);

        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]"));
        toggleCheckBox(checkBox);
        verifyCheckBoxIsSelected(checkBox);

        int totalCheckboxes = countCheckBoxes(driver);
        System.out.println("Total checkboxes on the page: " + totalCheckboxes);

        driver.quit();
    }

    private void scrollToElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.scrollToElement(element).perform();
        sleep(2000);
    }

    private void toggleCheckBox(WebElement checkBox) {
        checkBox.click();
        sleep(2000);
        checkBox.click();
        sleep(2000);
    }

    private void verifyCheckBoxIsSelected(WebElement checkBox) {
        boolean isSelected = checkBox.isSelected();
        System.out.println("Checkbox selected: " + isSelected);
    }

    private int countCheckBoxes(WebDriver driver) {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
        return checkBoxes.size();
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
