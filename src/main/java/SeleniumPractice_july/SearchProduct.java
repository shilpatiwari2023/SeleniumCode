package SeleniumPractice_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SearchProduct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();
        System.out.println("Title of home page is : " + homepageTitle);
        Assert.assertEquals(homepageTitle,"Automation Exercise");
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
        String textOnClickProducts = driver.findElement(By.xpath("//h2[text()='All Products']")).getText();
        System.out.println("Text on clicking Test cases : " + textOnClickProducts);
        Assert.assertEquals(textOnClickProducts, "ALL PRODUCTS");
        driver.findElement(By.xpath("//div[@class='left-sidebar']"));
        System.out.println("Product list is visible");
        String searchKeyword = "shoes";
        driver.findElement(By.id("search_product")).sendKeys(searchKeyword);
        driver.findElement(By.id("submit_search")).click();
        String textOnSearch = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        System.out.println("Text appeared after searching : " + textOnSearch);
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='features_items']"));
        Thread.sleep(10000);
        // Verify each product title contains the search keyword
        for (WebElement product : products) {
            String title = product.getText().toLowerCase();
            Assert.assertEquals(textOnSearch, "SEARCHED PRODUCTS");
            //  Get list of product titles

            System.out.println("Product Title: " + title);
            Assert.assertTrue(title.contains(searchKeyword.toLowerCase()),
                    "Product title does not match search: " + title);
        }
    }
}
