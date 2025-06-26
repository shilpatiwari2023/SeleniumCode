package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;


public class AssertTileOfPage {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Step 1: Open the GeeksforGeeks website
        driver.get("https://www.geeksforgeeks.org/");

// Step 2: Get the title of the webpage and store it in a variable
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle : " + actualTitle);

// Step 3: Set the expected title
        String expectedTitle = "GeeksforGeeks - A Computer Science Portal for Geeks";
        System.out.println("expectedTitle : " + expectedTitle);
// Step 4: Check if the titles match
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Title didn't match");
        }

// Alternatively, using Assert
        //Assert.assertEquals(actualTitle, expectedTitle);

    }
}