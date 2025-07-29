package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyAllProductsList {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
        String textOnClickProducts = driver.findElement(By.xpath("//h2[text()='All Products']")).getText();
        System.out.println("Text on clicking Test cases : " + textOnClickProducts);
        Assert.assertEquals(textOnClickProducts, "ALL PRODUCTS");
        driver.findElement(By.xpath("//div[@class='left-sidebar']"));
        System.out.println("Product list is visible");


    }
}
