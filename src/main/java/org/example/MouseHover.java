package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com/");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//span[text()=\"Automation\"]"))).perform();
    }
}
