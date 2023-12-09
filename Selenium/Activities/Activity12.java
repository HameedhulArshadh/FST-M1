package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        String inputField = "//input[@id='input-text']";
        String enableInputField = "//button[@id='toggleInput']";

        System.out.println(driver.findElement(By.xpath(inputField)).isEnabled());

        driver.findElement(By.xpath(enableInputField)).click();
        System.out.println(driver.findElement(By.xpath(inputField)).isEnabled());

        driver.quit();
    }
}
