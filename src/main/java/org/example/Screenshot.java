package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Screenshot {
    public static void main(String[] args) throws Exception {
        // Set up your WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://www.google.com");

        //screenshot of the entire page
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        byte[] screenshotBytes = screenshot.getScreenshotAs(OutputType.BYTES);

        // Save the screenshot to a file
        FileUtils.writeByteArrayToFile(new File("target/evidences/screenshot.png"), screenshotBytes);

        // Quit
        driver.quit();
    }
}



