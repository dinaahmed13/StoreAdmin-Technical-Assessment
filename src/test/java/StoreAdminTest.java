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
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.posnic.io/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void storeAdminLoginSuccessfully(){
        driver.findElement(By.xpath("//button[normalize-space()='Enter as admin']")).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard_page"))).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
