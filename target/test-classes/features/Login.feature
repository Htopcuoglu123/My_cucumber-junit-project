@Regression @smoke
Feature: Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin
  #It is similar to TestNG @Before Method. Background runs before each scenario
  Background:For each scenario the user is on the library login page
    #We can add only first running step or steps that is the same in all scenarios
    Given user is on the library login page

@Librarian
  Scenario: Login as librarian
   # Given user is on the library login page

@Student @Librarian
    Scenario: Login as student
    #  Given user is on the library login page
      When user enters student username
      And user enters student password
      Then user should see dashboard
@admin @Librarian
  Scenario: Login as admin
    #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard

  @teacher
  Scenario: Login as teacher
 # Given user is on the library login page
  When user enters teacher username
  And user enters teacher password
  Then user should see dashboard
