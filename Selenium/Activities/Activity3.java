package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // create an instance of the driver
        WebDriver driver = new FirefoxDriver();

        // Activity code
        String link = "https://v1.training-support.net/selenium/login-form";
        driver.get(link);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();

    }
}
