package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());

        WebElement table = driver.findElement(By.tagName("table"));

        System.out.print("Number of Rows in the first table: ");
        System.out.println((driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"))).size());

        System.out.print("Number of columns in the first table: ");
        System.out.println((driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"))).size());


        System.out.println("Values of 3rd Row is: ");
        int count = 1;
        for (WebElement i: driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"))) {
            System.out.print(count);
            System.out.print(" - ");
            System.out.println(i.getText());
            count += 1;
        }

        System.out.println(driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td")).get(1).getText());
        driver.quit();
    }

}
