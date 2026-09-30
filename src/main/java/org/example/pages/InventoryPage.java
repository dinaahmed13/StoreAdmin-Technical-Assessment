package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BasePage {
    private final By inventoryTab = By.id("v-pills-inventory-tab");
    private final By itemsPage = By.id("view_items_page");
    private final By addItemsButton = By.cssSelector("[title='Add items']");
    private final By standardItemLink = By.xpath("//a[normalize-space()='Standard item']");
    private final By productNameInput = By.id("items_name");
    private final By sellingPriceInput = By.id("items_selling_price");
    private final By saveItemButton = By.id("item_button_title");
    private final By successMessage = By.xpath("//h2[text()='success']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickInventoryTab() {
        findElement(inventoryTab).click();
    }

    public void clickItems() {
        findElement(itemsPage).click();
    }
    public void clickAddItems() {
        findElement(addItemsButton).click();
    }

    public void clickStandardItem() {
        findElement(standardItemLink).click();
    }
    public void enterProductName(String product){
        findElement(productNameInput).sendKeys(product);
    }
    public void enterSellingPrice(String product){
        findElement(sellingPriceInput).sendKeys(product);
    }
    public void clickSaveItem() {
        findElement(saveItemButton).click();
    }

    public WebElement getSuccessMessage() {
        return findElement(successMessage);
    }


}
