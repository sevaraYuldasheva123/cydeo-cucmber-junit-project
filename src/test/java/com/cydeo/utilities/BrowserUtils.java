package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    //in this class we will be storing the utility methods that will be used across the project


    //this method accepts int as seconds and waits for given duration
    public static void sleep(int seconds){
        seconds*=1000; //seconds = seconds * 1000;
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle){
        Set<String> allHandles = Driver.getDriver().getWindowHandles();

        for (String eachHandle : allHandles){
            Driver.getDriver().switchTo().window(eachHandle);
            //System.out.println("driver.getTitle() = " + driver.getTitle());
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyInTitle( String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void waitForInvisibilityOfGivenElement(WebElement targetElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(targetElement));
    }

    public static void waitForTitlecontains(String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * This method accepts dropdown element and returns A List of
     * Strings with all the options of dropdown as String
     * @param dropdownElement
     * @return actualMonthAsString
     */
    public static List<String> dropdownOptions_As_STRING(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement> actualMonthAsWebElement = select.getOptions();

        List<String> actualMonthsAsString = new ArrayList<>();

        for (WebElement eachMonth: actualMonthAsWebElement){
            actualMonthsAsString.add(eachMonth.getText());
        }

        return actualMonthsAsString;
    }

    public static void clickRadioBtn(List<WebElement> allRadioBTNs , String attributeValue){
        for (WebElement eachRadio : allRadioBTNs ){
            if (eachRadio.getAttribute("value").equals(attributeValue)){
                eachRadio.click();
            }
        }

    }

}
