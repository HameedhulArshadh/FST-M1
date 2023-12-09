package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");

        Actions actions = new Actions(driver);

        actions.sendKeys("H");
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.sendKeys("c");
        actions.keyDown(Keys.CONTROL);
        actions.perform();
        driver.quit();
    }
    }