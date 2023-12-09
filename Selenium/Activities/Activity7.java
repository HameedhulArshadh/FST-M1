package activities;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        Actions actions = new Actions(driver);
        WebElement ball = driver.findElement(By.xpath("//img[@id='draggable']"));
        WebElement dropzone1 = driver.findElement(By.xpath( "//div[@id='droppable']"));
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

        actions.dragAndDrop(ball, dropzone1).perform();
        System.out.println(driver.findElement(By.xpath("//div[@id='droppable']")).getText());

        actions.dragAndDrop(ball, dropzone2).perform();
        System.out.println(driver.findElement(By.xpath("//div[@id='dropzone2']")).getText());

        driver.quit();
    }
}
