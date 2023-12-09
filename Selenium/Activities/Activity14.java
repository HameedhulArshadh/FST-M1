package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());

        WebElement table = driver.findElements(By.tagName("table")).get(1);

        int columns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th")).size();
        int  rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr")).size();

        System.out.println(driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        Thread.sleep(1);

        if(driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th[1]")).isEnabled()){
            System.out.println("Sorting");
            driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th[1]")).click();
        }

        System.out.println(driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());

        for (WebElement element : driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"))){
            System.out.print(element.getText());
            System.out.print(" ");
        }

        driver.quit();
    }
}
