package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        //    Open a new browser to https://v1.training-support.net/selenium/selects
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //    Get the title of the page and print it to the console.
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        //    On the Single Select:
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropdown);

        //    Select the second option using the visible text.
        select.selectByVisibleText("Option 2");

        //    Select the third option using the index.
        select.selectByIndex(3);

        //    Select the fourth option using the value.
        select.selectByValue("4");

        //    Get all the options and print them to the console.
        // Print all the options
        List<WebElement> options = select.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : options) {
            System.out.println(option.getText());
        }
        // Close the browser
        driver.quit();
    }


}
