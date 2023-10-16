package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiPage wikiPage = new WikiPage();
    @Given("User is on the wikipedia search page")
    public void user_is_on_the_wikipedia_search_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("user types {string} in wiki search box")
    public void user_types_in_wiki_search_box(String searchValue) {
        wikiPage.searchBox.sendKeys(searchValue);
    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchBTN.click();
    }
    @Then("user should see {string} is in the wiki title")
    public void user_should_see_is_in_the_wiki_title(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("user should see {string} is in the main header")
    public void userShouldSeeIsInTheMainHeader(String expectedInHeaderText) {

        String actualHeaderText = wikiPage.steveJobsHeader.getText();
        Assert.assertTrue(actualHeaderText.contains(expectedInHeaderText));

    }

    @Then("user should see {string} is in the image header")
    public void userShouldSeeIsInTheImageHeader(String expectedImgHeaderText) {

        String actualImgHeaderText = wikiPage.steveJobsImageHeader.getText();
        Assert.assertTrue(actualImgHeaderText.contains(expectedImgHeaderText));

    }
}
