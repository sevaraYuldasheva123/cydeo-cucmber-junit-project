package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.pages.WebTable_ViewAllOrdersPage;
import com.cydeo.pages.WebTablesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebTables_StepDefinitions {

    WebTablesPage page = new WebTablesPage();
    @Given("user is on the login page of webTable")
    public void user_is_on_the_login_page_of_web_table() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters Test as a username")
    public void user_enters_test_as_a_username() {
        page.username.sendKeys("Test");
    }
    @When("user enters Tester as a password")
    public void user_enters_tester_as_a_password() {
        page.password.sendKeys("Tester");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        page.logInBTN.click();
    }
    @Then("expected URL should end with orders")
    public void expected_url_should_end_with_orders() {
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.endsWith("orders"));
    }

    @When("user enters {string} as a username")
    public void userEntersAsAUsername(String username) {

        page.username.sendKeys(username);
    }

    @And("user enters {string} as a password")
    public void userEntersAsAPassword(String password) {
        page.password.sendKeys(password);
    }

    @Then("expected URL should end with {string}")
    public void expectedURLShouldEndWith(String expectedUrlEnd) {
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.endsWith(expectedUrlEnd));
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
        page.username.sendKeys(credentials.get("username"));
        page.password.sendKeys(credentials.get("password"));
        page.logInBTN.click();
    }

    @Given("user is already logged in to the Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
       /* Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        page.username.sendKeys("Test");
        page.password.sendKeys("Tester");
        page.logInBTN.click();

        */
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        //page.loginCredentialsRequired("Test", "Tester");
        page.loginNoCredentials();

    }

    WebTableOrderPage orderPage = new WebTableOrderPage();
    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        BrowserUtils.sleep(2);
        orderPage.orderLink.click();
        BrowserUtils.sleep(2);
    }
    /*
    @Then("user sees below options under {string} dropdown")
    public void user_sees_below_options_under_dropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_As_STRING(orderPage.productElement);

        Assert.assertEquals(actualOptions, expectedOptions);


    }

     */

    @Then("user sees below options under product dropdown")
    public void userSeesBelowOptionsUnderProductDropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_As_STRING(orderPage.productElement);

        Assert.assertEquals(actualOptions, expectedOptions);
    }


    @Then("user sees Visa  radio button option enabled")
    public void user_sees_visa_radio_button_option_enabled() {

        Assert.assertTrue(orderPage.visaRadioBTN.isEnabled());
    }


    @Then("user sees Mastercard  radio button option enabled")
    public void user_sees_mastercard_radio_button_option_enabled() {
        Assert.assertTrue(orderPage.masterCardRadioBtn.isEnabled());
    }

    @Then("user sees American Express  radio button option enabled")
    public void user_sees_american_express_radio_button_option_enabled() {
        Assert.assertTrue(orderPage.amexRadioBTN.isEnabled());
    }


    @Then("user chooses  {string} in product section")
    public void userChoosesInProductSection(String productType) {
        Select productOptions = new Select(orderPage.productElement);
        productOptions.selectByVisibleText(productType);
    }

    @Then("user enters {string} into Quantity")
    public void userEntersIntoQuantity(String howManyWeWant) {
        orderPage.quantity.sendKeys(howManyWeWant);
    }

    @Then("user enters {string} into Customer name")
    public void userEntersIntoCustomerName(String fullName) {
        orderPage.customerName.sendKeys(fullName);
    }

    @Then("user enters {string} into Street")
    public void userEntersIntoStreet(String streetName) {
        orderPage.street.sendKeys(streetName);
    }

    @Then("user enters {string} into City")
    public void userEntersIntoCity(String cityName) {
        orderPage.city.sendKeys(cityName);
    }

    @Then("user enters {string} into State")
    public void userEntersIntoState(String stateName) {
        orderPage.state.sendKeys(stateName);
    }

    @Then("user enters {string} into Zip")
    public void userEntersIntoZip(String zipCode) {
        orderPage.zip.sendKeys(zipCode);
    }

    @Then("user is clicks on Visa card")
    public void userIsClicksOnVisaCard() {
        orderPage.visaRadioBTN.click();
    }

    @Then("user enters {string} card number")
    public void userEntersCardNumber(String creditCardNumber) {
        orderPage.creditCard.sendKeys(creditCardNumber);
    }

    @Then("user is enters {string} expiration date")
    public void userIsEntersExpirationDate(String expDate) {
        orderPage.expirationDate.sendKeys(expDate);
    }

    @Then("user clicks Process order")
    public void userClicksProcessOrder() {
        orderPage.processOrderBTN.click();
    }


    WebTable_ViewAllOrdersPage viewAllOrdersPage = new WebTable_ViewAllOrdersPage();
    @Then("user should see new order {string} in the table on View all orders")
    public void userShouldSeeNewOrderInTheTableOnViewAllOrders(String expectedName) {

        String actualName = viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals(actualName, expectedName);

    }
}
