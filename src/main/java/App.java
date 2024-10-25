import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class App 
{

    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/home/xamblot/Desktop/SeleniumWithJava/selenium/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        
        // implicit wait
/*         driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement mousehover = driver.findElement(By.xpath("//li[@data-currenttabindex=\"4\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[4]/a")).click(); */

        // keyboard event
		/* driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement sourceelement = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.keyDown(sourceelement, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform(); // as it has lot of operations to be performed in sequences, we have to use build and then perform
		Thread.sleep(1000);
		WebElement destinationelement = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		Thread.sleep(1000);
		action.keyDown(destinationelement, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(3000);
		driver.quit(); */

        // click right
/*         driver.get("https://jqueryui.com/slider/#colorpicker");
        WebElement box2 = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
        Actions action = new Actions(driver);
        action.contextClick(box2).perform(); */

/*         driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(box2, 10, 100).perform(); //x and y coordinates depends on basic position of the element choosen. from there it will take 0, -ve and +ve
		
		action.contextClick().perform();
		Thread.sleep(2000); */

        // resize
/*         driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
		Actions action = new Actions(driver); 
		action.dragAndDropBy(drag, 100, 50).perform(); */
    }

    private static void DropDrag(WebDriver driver) throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();

    }

    private static void MouseOver(WebDriver driver) {

        driver.get("https://www.ebay.com/");

        WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]"));

		Actions action = new Actions(driver);
		action.moveToElement(firstelement).perform();// perform operation is must to execute before executing build()
    }

    public static void AlertPop(WebDriver driver)
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
		
        String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());

        driver.close();
    }


    public void RatioRun(WebDriver driver)
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
        var radio = driver.findElement(By.xpath("//*[@id=\"male\"]"));
        radio.click();
    }
}
