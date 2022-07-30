#sign up page

Feature: feature to test sign up page functionality

  Scenario: Validate sign up page is working
    Given browser is open
    And user is on tide home page
    When user click on signup page
    And enter inforamtion
    Then user is navigated to next page
