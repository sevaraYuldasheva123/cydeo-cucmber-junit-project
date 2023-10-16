package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableOrderPage extends WebTable_BasePage{

    public WebTableOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productElement;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioBTN;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioBtn;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement amexRadioBTN;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement creditCard;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement expirationDate;

    @FindBy(xpath = "//button[text()='Process Order']")
    public WebElement processOrderBTN;




}
