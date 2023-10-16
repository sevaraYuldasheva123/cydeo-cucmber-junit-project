package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    //LibraryPage page = new LibraryPage();

    @Given("user is on the  login page of a library application")
    public void user_is_on_the_login_page_of_a_library_application() {
        //Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        System.out.println("going to library page");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("entering librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("entering librarian password");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("seeing the dashboard");
    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("entering student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("entering student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("entering admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("entering admin password");
    }
}
