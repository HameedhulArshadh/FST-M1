package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());

        // Find the 3rd header on the page and print it's text to the console.
        System.out.println(driver.findElement(By.xpath("//h3")).getText());

        // Find the 5th header on the page and print it's color.
        System.out.println(driver.findElement(By.xpath("//h5")).getCssValue("color"));

        // Find the violet button and print all it's classes.
        System.out.println(driver.findElement(By.className("violet")).getAttribute("class"));

        // Find the grey button and print it's text.
        System.out.println(driver.findElement(By.className("grey")).getText());


        driver.quit();

    }
}
