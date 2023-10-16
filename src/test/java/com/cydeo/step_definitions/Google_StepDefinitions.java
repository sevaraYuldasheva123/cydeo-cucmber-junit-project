package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GooglePage googlePage = new GooglePage();

    @When("user is on the Google seach page")
    public void user_is_on_the_google_seach_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should be able see title is Google")
    public void user_should_be_able_see_title_is_google() {

        Assert.assertEquals(Driver.getDriver().getTitle(), "Google");
    }

    @Given("user is on the Google search page")
    public void userIsOnTheGoogleSearchPage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user search for {string}")
    public void userSearchFor(String word) {
        googlePage.searchBar.sendKeys(word+ Keys.ENTER);
    }

    @Then("user should be able to see title as {string};")
    public void userShouldBeAbleToSeeTitleAs(String expectedTitle) {
         expectedTitle = "apple - Google Search";
         String actualTitle = Driver.getDriver().getTitle();

         BrowserUtils.sleep(3);
         Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user search for {word}")
    public void userSearchForOrange(String word) {
        googlePage.searchBar.sendKeys(word+Keys.ENTER);
        BrowserUtils.sleep(3);
    }

    @Then("user should be able to see orange - Search")
    public void userShouldBeAbleToSeeOrangeSearch() {

        String expectedTitle = "orange - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
