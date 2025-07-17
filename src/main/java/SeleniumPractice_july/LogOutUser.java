package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogOutUser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle, "Automation Exercise");
        driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]")).click();
        String verifytextonlogin = driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]")).getText();
        Assert.assertEquals(verifytextonlogin, "Login to your account");
        driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("shilpatiwari2023@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Shilpa");
        driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
        System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]/b")).getText());
        WebElement nameElement = driver.findElement(By.xpath("//a/b[text()='Shilpa']"));
        System.out.println("Logged in as : " + nameElement.getText());
        Assert.assertEquals("Logged in as " + nameElement.getText(), "Logged in as Shilpa");
        driver.findElement(By.linkText("Logout")).click();
        String homepageTitle1 = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle1);
        Assert.assertEquals(homepageTitle1, "Automation Exercise - Signup / Login");
        driver.quit();
    }
}
