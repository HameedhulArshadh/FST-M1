package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());

        driver.quit();
    }
}
