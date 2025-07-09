package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterUser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]")).click();
        String verifytextonsignup = driver.findElement(By.xpath("//h2[text()=\"New User Signup!\"]")).getText();
        Assert.assertEquals(verifytextonsignup,"New User Signup!");
        driver.findElement(By.name("name")).sendKeys("Shilpa");
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("shilpatiwari205@gmail.com");
        driver.findElement(By.xpath("//button[@class= \"btn btn-default\" and text()=\"Signup\"]")).click();
        String verifytextaccountinfo = driver.findElement(By.xpath("//b[text()=\"Enter Account Information\"]")).getText();
        Assert.assertEquals(verifytextaccountinfo, "ENTER ACCOUNT INFORMATION");
        driver.findElement(By.xpath("//input[@value=\"Mrs\"]")).click();
        driver.findElement(By.id("password")).sendKeys("Shilpa");
        WebElement dropdown_day = driver.findElement(By.id("days"));
        Select selectDay = new Select(dropdown_day);
        selectDay.selectByValue("16");
        WebElement dropdown_month = driver.findElement(By.id("months"));
        Select selectMonth = new Select(dropdown_month);
        selectMonth.selectByIndex(8);
        WebElement dropdown_year = driver.findElement(By.id("years"));
        Select selectYear = new Select(dropdown_year);
        selectYear.selectByValue("1995");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Pramod");
        driver.findElement(By.id("last_name")).sendKeys("Dutta");
        driver.findElement(By.id("company")).sendKeys("Oracle");
        driver.findElement(By.id("address1")).sendKeys("Mira road");
        driver.findElement(By.id("address2")).sendKeys("Srishti");
        WebElement dropdown_country = driver.findElement(By.id("country"));
        Select selectCountry = new Select(dropdown_country);
        selectCountry.selectByValue("India");
        driver.findElement(By.id("state")).sendKeys("Maharashtra");
        driver.findElement(By.id("city")).sendKeys("Mumbai");
        driver.findElement(By.id("zipcode")).sendKeys("401107");
        driver.findElement(By.id("mobile_number")).sendKeys("9967360411");
        driver.findElement(By.xpath("//button[text()=\"Create Account\"]")).click();
        String verifytext_accountcreated = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).getText();
        Assert.assertEquals(verifytext_accountcreated,"ACCOUNT CREATED!");
        driver.findElement(By.linkText("Continue")).click();
        System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]/b")).getText());
        WebElement nameElement = driver.findElement(By.xpath("//a/b[text()='Shilpa']"));
        System.out.println("Logged in as  " + nameElement.getText());
        Assert.assertEquals(("Logged in as  " + nameElement.getText()), "Logged in as  Shilpa");
        driver.findElement(By.xpath("//a[text()=\" Delete Account\"]")).click();
        String verifyaccount_delete = driver.findElement(By.xpath("//b[text()=\"Account Deleted!\"]")).getText();
        Assert.assertEquals(verifyaccount_delete, "ACCOUNT DELETED!");
        driver.findElement(By.xpath("//a[@class= \"btn btn-primary\"]")).click();






    }
}