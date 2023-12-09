package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());

        String original_window = driver.getWindowHandle();
        String second_window = "";

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles = driver.getWindowHandles();
        for(String handle: handles){
            if(handle != original_window){
                second_window = handle;
                driver.switchTo().window(handle);
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable((By.id("actionButton"))));
        System.out.println(driver.getTitle());


        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        handles = driver.getWindowHandles();
        for(String handle: handles){
            if(handle != original_window && handle != second_window){
                driver.switchTo().window(handle);
            }
        }
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
