package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class Submit_Form {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired webpage
        driver.get("file://C:/Users/DELL/IdeaProjects/SeleniumCode/src/main/HTML/mypage.html"); // Replace with your actual webpage URL

        // Find the input fields using ID
        WebElement firstName = driver.findElement(By.id("FirstName"));
        WebElement dob = driver.findElement(By.id("DOB"));
        WebElement email = driver.findElement(By.id("Email"));
        WebElement inputNumber = driver.findElement(By.id("inputNumber"));
        WebElement maleRadioButton = driver.findElement(By.id("Male"));

        // Fill out the form
        firstName.sendKeys("Ram");
        dob.sendKeys("19-01-2001");
        email.sendKeys("ram@example.com");
        inputNumber.sendKeys("1234567890");
        maleRadioButton.click();

        // Click the submit button using CSS Selector
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //for screenshot
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //save screenshot

        File destination = new File("target/Screenshots/screenshot.png");
       try {
           FileUtils.copyFile(screenshot, destination);
       } catch (IOException e) {
           System.err.println("An I/O error occurred: " + e.getMessage());
       }

        // Switch to alert and get alert text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        // Check if the alert is open
        if (alertText != null) {
            System.out.println("Alert is open, and the content is: " + alertText);
            // Optionally accept the alert if needed
            // alert.accept();
        } else {
            System.out.println("No alert found.");
        }

        // Quit the browser
        driver.quit();
    }
}