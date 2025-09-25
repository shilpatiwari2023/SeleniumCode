package uitestingplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

/*Click
Physical mouse click and DOM event emulated click are differently handled by browsers.
There are still cases, with sometimes hardly identifiable reasons, when an event based click does not work.
The solution for this problem is emulating physical mouse click.
This page is specifically designed to ignore event based click.

Scenario
Record button click. The button becomes green after clicking.
Then execute your test to make sure that it is able to click the button.
Playground

* */
public class EmulateMouseClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/click");
        WebElement recordButton = driver.findElement(By.xpath("//button[@id='badButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(recordButton).click().perform();
        /*String color = recordButton.getCssValue("background-color");
        System.out.println("Button color: " + color);

// Verify it's green (exact RGBA may vary)
        Assert.assertEquals("rgba(0, 109, 226, 1)", color);*/

        String color = recordButton.getCssValue("background-color");
        String hexColor = Color.fromString(color).asHex();  // Converts to #RRGGBB

        System.out.println("Button color: " + hexColor);
        Assert.assertEquals(hexColor,"#006bdd"); // green
    }
}
