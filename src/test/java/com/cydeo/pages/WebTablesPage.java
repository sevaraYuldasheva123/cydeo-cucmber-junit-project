package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage {

    public WebTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;


    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBTN;

    @FindBy(xpath = "//button[text()='Order']")
    public WebElement orderPage;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

    public void loginCredentialsRequired(String inputUserName, String inputPassword){
        this.username.sendKeys(inputUserName);
        this.password.sendKeys(inputPassword);
        this.logInBTN.click();
    }

    public void loginNoCredentials(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.logInBTN.click();
    }
}
