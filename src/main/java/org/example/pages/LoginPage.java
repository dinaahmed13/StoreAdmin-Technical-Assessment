package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By enterAsAdminButton = By.xpath("//button[normalize-space()='Enter as admin']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickEnterAsAdminButton() {
        findElement(enterAsAdminButton).click();
    }

}