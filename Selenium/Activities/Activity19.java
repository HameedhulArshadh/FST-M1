package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
//        Open a new browser to https://v1.training-support.net/selenium/javascript-alerts
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

//        Get the title of the page and print it to the console.
        System.out.println(driver.getTitle());

//        Find the button to open a CONFIRM alert and click it.
        driver.findElement(By.id("prompt")).click();

//        Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert alert = driver.switchTo().alert();

//        Close the alert once with Ok and again with Cancel.
        System.out.println(alert.getText());
        alert.accept();
//        Close the browser.
        driver.quit();
    }
}
