@loginPage
Feature: Library login feature
  Agile story: As a user, I should be able to login with different accounts.And dashboard should be displayed
  Accounts: librarian, student, admin

  Background:
    Given user is on the  login page of a library application

    @librarian @smoke
      Scenario: Login as librarian
        When  user enters librarian username
        And user enters librarian password
        Then user should see dashboard

      @student @smoke
      Scenario: Login as a student
        When user enters student username
        And user enters student password
        Then user should see dashboard

        @admin @smoke
      Scenario: Login as a admin
        When user enters admin username
        And user enters admin password
        Then user should see dashboard
