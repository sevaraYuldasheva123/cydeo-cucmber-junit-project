package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("user should se below list")
    public void user_should_se_below_list(List<String> fruitsAndVeggies) {
        System.out.println("fruitsAndVeggies = " + fruitsAndVeggies);

        System.out.println("fruitsAndVeggies.get(1) = " + fruitsAndVeggies.get(1));

    }

    @Then("I will share my favourites")
    public void iWillShareMyFavourites(List<String> listOfPets) {
        System.out.println(listOfPets);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"phone\") = " + driverInfo.get("phone"));
    }

    @Given("user is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DataTablesPage page = new DataTablesPage();
    @Then("user should see below info in a month dropdown")
    public void user_should_see_below_info_in_a_month_dropdown(List<String> expectedMonths) {


        Assert.assertEquals(expectedMonths, BrowserUtils.dropdownOptions_As_STRING(page.monthDropdown));



    }
}
