package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // setup the driver
        // WebDriverManager.firefoxdriver().setup();

        // create an instance of the driver
        WebDriver driver = new FirefoxDriver();


        // Activity code
        String link = "https://v1.training-support.net";
        driver.get(link);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
