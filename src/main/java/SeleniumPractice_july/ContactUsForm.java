package SeleniumPractice_july;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

/*
 Practice code - https://automationexercise.com/test_cases
 Test Case 6: Contact Us Form
 Concepts - File upload feature, alert handling
 */
public class ContactUsForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//a[text()=\" Contact us\"]")).click();
        String text_ContactUs = driver.findElement(By.xpath("//h2[text()=\"Get In Touch\"]")).getText();
        System.out.println("Text on clicking contact us : " + text_ContactUs);
        Assert.assertEquals(text_ContactUs, "GET IN TOUCH");
        driver.findElement(By.name("name")).sendKeys("Sunita");
        driver.findElement(By.name("email")).sendKeys("shilpatiwari2023@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("To contact RM for defect");
        driver.findElement(By.name("message")).sendKeys("Type message here for contacting the desk");
        Thread.sleep(10000);
        WebElement file_upload = driver.findElement(By.name("upload_file"));
        file_upload.sendKeys("F:\\Shilpa_Docs\\notes.txt");
        Thread.sleep(5000);
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        String text_submitContactForm = driver.findElement(By.xpath("//div[@class=\"status alert alert-success\"]")).getText();
        System.out.println("Text on submitting the contact form : " + text_submitContactForm);
        Assert.assertEquals(text_submitContactForm, "Success! Your details have been submitted successfully.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()=\" Home\"]")).click();
        String homepageTitle1 = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle1);
        Assert.assertEquals(homepageTitle1,"Automation Exercise");
        driver.quit();
    }
}
