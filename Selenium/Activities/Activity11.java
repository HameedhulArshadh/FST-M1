package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        String checkboxToggle = "//button[@id='toggleCheckbox']";
        String checkbox = "//div[@id='dynamicCheckbox']/input";

        System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());

        driver.findElement(By.xpath(checkbox)).click();
        System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());

        driver.quit();
    }
}
