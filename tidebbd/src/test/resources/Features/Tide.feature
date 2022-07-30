#automatic the test cases

Feature: feature to test tide.com website functionality

Scenario: Validate tide.com is working
Given browser is open
And user is on tide home page
When user enters a text in search box
And  hit enter
Then user is navigated to search results

