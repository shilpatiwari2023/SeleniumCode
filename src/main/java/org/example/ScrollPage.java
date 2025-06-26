package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.automationexercise.com/");

        js.executeScript("window.scrollBy(0, 1000)");

        //driver.quit();

    }
}
