package com.tolgakonat;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        System.setProperty("webdriver.chrome.driver", "/home/xamblot/Desktop/SeleniumWithJava/selenium/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com/"); // get google website meta

        DoLoginWithMethods(driver);

    }
    private static void DoLoginWithMethods(WebDriver driver) {

        WebElement usernameElement = driver.findElement(By.id("user-name"));
        usernameElement.sendKeys("1");


        driver.findElement(By.className("form_input")).sendKeys("2");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("3");


        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("4");

        driver.findElement(By.tagName("input")).sendKeys("5");
    }

}
