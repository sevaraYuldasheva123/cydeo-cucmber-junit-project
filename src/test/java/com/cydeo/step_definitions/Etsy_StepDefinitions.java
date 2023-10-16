package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on the etsy search page")
    public void user_is_on_the_etsy_search_page() {
        Driver.getDriver().get("https://www.etsy.com/");
    }
    @Then("user sees title as {string}")
    public void user_sees_title_as(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBar.sendKeys("Wooden Spoon");
    }
    @When("user clicks etsy search button")
    public void user_clicks_etsy_search_button() {
       etsyPage.searchBTN.click();
    }
    @Then("user sees Wooden Spoon in the title")
    public void user_sees_wooden_spoon_in_the_title() {

        String expectedInTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchWord) {
        etsyPage.searchBar.sendKeys(searchWord);

    }
    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
