@Contact-Us
Feature: WebDriver University - Contact Us Page

  Background:
    Given I access the webdriver university contact us page

  Scenario: Validate Successful submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario:Validate Successful submission - Specific Data
    When I enter specific first name khaled
    And I enter specific last name mohsen
    And I enter specific email address "khaledtesr@gmail.com"
    And I enter specific comment "How are you ?"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
