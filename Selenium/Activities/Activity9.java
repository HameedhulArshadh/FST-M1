package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());

        String changeContentButton = "//button[@class='ui violet button']";
        String textField1 = "//div[@id='ajax-content']/h1";
        String textField2 = "//div[@id='ajax-content']/h3";

        driver.findElement(By.xpath(changeContentButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(textField1)));
        System.out.println(driver.findElement(By.xpath(textField1)).getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(textField2), "I'm late!"));
        System.out.println(driver.findElement(By.xpath(textField2)).getText());

        driver.quit();


    }
}
