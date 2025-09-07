package uitestingplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * https://uitestingplayground.com/dynamicid
 * Dynamic ID
 * Modern applications often generate dynamic IDs for elements. In this case ID is not a reliable attribute for using in element selector. By default many UI automation tools record IDs and this results in tests broken from the very beginning. An automation tool needs a way to instruct it to skip dynamic IDs when XPath is generated for an element.
 *
 * Scenario
 * Record button click.
 * Then execute your test to make sure that ID is not used for button identification.
 */

public class DynamicID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/dynamicid");
        //driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
        //driver.findElement(By.xpath("//button[contains(text(),'Button with Dynamic ID')]")).click();
        driver.findElement(By.xpath("//button[starts-with(text(),'Button')]")).click();
    }
}
