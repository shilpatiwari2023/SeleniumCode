package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class HyperlinkTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired webpage
        driver.get("file://C:/Users/DELL/IdeaProjects/SeleniumCode/src/main/HTML/mypage1.html"); // Replace with your actual webpage URL
        driver.findElement(By.linkText("Visit Google")).click();

        // Quit the browser
        driver.quit();
    }
}