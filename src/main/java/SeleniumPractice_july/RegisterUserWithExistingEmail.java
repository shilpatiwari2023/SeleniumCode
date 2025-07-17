package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterUserWithExistingEmail {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]")).click();
        String verifytextonsignup = driver.findElement(By.xpath("//h2[text()=\"New User Signup!\"]")).getText();
        Assert.assertEquals(verifytextonsignup,"New User Signup!");
        driver.findElement(By.name("name")).sendKeys("Shilpa");
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("shilpatiwari205@gmail.com");
        driver.findElement(By.xpath("//button[@class= \"btn btn-default\" and text()=\"Signup\"]")).click();
        String verifytextofexistingaccountinfo = driver.findElement(By.xpath("//p[text()=\"Email Address already exist!\"]")).getText();
        Assert.assertEquals(verifytextofexistingaccountinfo, "Email Address already exist!");
        driver.quit();
    }
}
