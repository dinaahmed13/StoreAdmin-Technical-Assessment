package tests;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class StoreAdminTest {




    @Test(dataProvider = "productData",dataProviderClass = TestData.class)
    public void addNewProduct(String productName, String price){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Enter as admin']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("v-pills-inventory-tab"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("view_items_page"))).click();
        driver.findElement(By.cssSelector("[title='Add items']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Standard item']"))).click();
        driver.findElement(By.id("items_name")).sendKeys(productName);
        driver.findElement(By.id("items_selling_price")).sendKeys(price);
        driver.findElement(By.id("item_button_title")).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='success']"))).isDisplayed());

    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}
