@Login
Feature: WebDriver University - Login Page

  Background:
    Given I acsess the WebDriver University Login page

  Scenario Outline:Validate - successful & Unsuccessful login
    When I enter a username <username>
    And I enter pass <password>
    And I click on the login button
    Then I should be presented withe the following validation <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | khaled    | kmm1111      | validation failed      |