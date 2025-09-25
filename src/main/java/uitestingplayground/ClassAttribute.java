package uitestingplayground;

/*
Class Attribute
Class attribute of an element may contain more than one class reference. E.g.

<button class="btn btn-primary btn-test">
XPath selector relying on a class must be well formed. For example, the following will not work:

//button[@class='btn-primary']
Correct variant is

//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]
        Scenario
Record primary (blue) button click and press ok in alert popup.
Then execute your test to make sure that it can identify the button using btn-primary class.
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/classattr");
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();
    }
}
