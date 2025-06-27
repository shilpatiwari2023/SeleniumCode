package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Click {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        //Thread.sleep(10);
        //driver.findElement(By.linkText(" Products")).click();
        driver.findElement(By.partialLinkText("Cases")).click();

        //driver.quit();
    }
}
