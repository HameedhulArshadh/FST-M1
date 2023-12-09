package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);
        String cube_side = "//div[@class='active']";

        actions.click().perform();
        System.out.println(driver.findElement(By.xpath(cube_side)).getText());

        actions.doubleClick().perform();
        System.out.println(driver.findElement(By.xpath(cube_side)).getText());

        actions.contextClick().perform();
        System.out.println(driver.findElement(By.xpath(cube_side)).getText());

        driver.quit();
    }
}
