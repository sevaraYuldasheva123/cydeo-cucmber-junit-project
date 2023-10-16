package com.cydeo.step_definitions;

import com.cydeo.pages.BingPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {

    BingPage bingPage = new BingPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }
    @When("user enters orange in the Bing search box")
    public void user_enters_orange_in_the_bing_search_box() {
        bingPage.searchBar.sendKeys("orange"+ Keys.ENTER);
    }
    @Then("user should see orange in title")
    public void user_should_see_orange_in_title() {
        BrowserUtils.verifyInTitle("orange");
    }

    @When("user enters {string} in the Bing search box")
    public void userEntersInTheBingSearchBox(String searchWord) {
        bingPage.searchBar.sendKeys(searchWord +Keys.ENTER);
    }

    @Then("user should see {string} in title")
    public void userShouldSeeInTitle(String expectedInTitle) {
        BrowserUtils.verifyInTitle(expectedInTitle);
    }
}
