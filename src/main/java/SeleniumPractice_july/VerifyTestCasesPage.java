package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTestCasesPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//a[text()=\" Test Cases\"]")).click();
        String textOnClickTestCase = driver.findElement(By.xpath("//b[text()='Test Cases']")).getText();
        System.out.println("Text on clicking Test cases : " + textOnClickTestCase);
        Assert.assertEquals(textOnClickTestCase, "TEST CASES");
        Thread.sleep(5000);
        driver.quit();
    }
}
