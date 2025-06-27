package org.example;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
        public class GFGIDsOfWindows {

        public static void main(String[] args) throws InterruptedException {
            // Set the path for the ChromeDriver executable
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

            // Create an instance of ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Open the GeeksforGeeks website
            driver.get("https://www.geeksforgeeks.org/");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Delete all cookies
            driver.manage().deleteAllCookies();

            // Scroll down to locate an element
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 200)");

            // Click on the 'Courses at GeeksforGeeks' link
            driver.findElement(By.xpath("(//span[text()='Courses at GeeksforGeeks'])[2]")).click();

            // Wait for a moment to allow the new page to load
            Thread.sleep(2000);

            // Click on a specific course (Data Structures and Algorithms)
            driver.findElement(By.xpath("(//h4[text()='Data Structures and Algorithms - Self Paced'])[1]")).click();

            // Get the ID of the main (parent) window
            String parentId = driver.getWindowHandle();
            System.out.println("Parent Window ID: " + parentId);

            // Get the IDs of all open windows (child windows)
            Set<String> windowIds = driver.getWindowHandles();

            // Print the IDs of all windows
            for (String id : windowIds) {
                System.out.println("Window ID: " + id);
            }

            // Optionally, you can switch back to the parent window if needed
            driver.switchTo().window(parentId);

            // Close the browser
            driver.quit();
        }
    }
}
