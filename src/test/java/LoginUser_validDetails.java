import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUser_validDetails {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]")).click();
        String verifytextonlogin = driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]")).getText();
        Assert.assertEquals(verifytextonlogin,"Login to your account");
        driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("shilpatiwari2025@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Validpassword1");
        driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();

    }
}
