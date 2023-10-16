package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

    public WikiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchBTN;

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement steveJobsHeader;

    @FindBy(xpath = "//a[@class='mw-file-description']//img[@data-file-height='2929']")
    public WebElement steveJobsIMG;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement steveJobsImageHeader;

}
