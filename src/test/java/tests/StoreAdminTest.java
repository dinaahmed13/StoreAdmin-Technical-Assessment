package tests;

import base.BaseTest;
import data.TestData;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class StoreAdminTest extends BaseTest {




    @Test(dataProvider = "productData",dataProviderClass = TestData.class)
    public void addNewProduct(String productName, String price){

        LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);

        loginPage.clickEnterAsAdminButton();
        inventoryPage.clickInventoryTab();
        inventoryPage.clickItems();
        inventoryPage.clickAddItems();
        inventoryPage.clickStandardItem();
        inventoryPage.enterProductName(productName);
        inventoryPage.enterSellingPrice(price);
        inventoryPage.clickSaveItem();

        Assert.assertTrue(inventoryPage.getSuccessMessage().isDisplayed());

    }


}
