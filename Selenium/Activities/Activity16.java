package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        String signUpForm = "//div[@id='dynamic-attributes-form']/div/div/input";
        String signUpButton = "//button[text()='Sign Up']";
        String confirmation = "//div[@id='action-confirmation']";

        driver.findElements(By.xpath(signUpForm)).get(2).sendKeys("abc@gmail.com");
        driver.findElements(By.xpath(signUpForm)).get(3).sendKeys("abc@gmail");
        driver.findElements(By.xpath(signUpForm)).get(4).sendKeys("abc@gmail");
        driver.findElements(By.xpath(signUpForm)).get(5).sendKeys("abc@gmail.com");

        driver.findElement(By.xpath(signUpButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmation)));
        System.out.println(driver.findElement(By.xpath(confirmation)).getText());
        driver.quit();
    }
}
