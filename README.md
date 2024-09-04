# Selenium WebDriver 4 - Cucumber BDD Framework

This project demonstrates the use of **Selenium WebDriver 4** in combination with **Cucumber BDD** for automated testing of web applications. The framework is built using **Java**, **JUnit**, and follows the **Behavior-Driven Development (BDD)** approach.

## Table of Contents
- [Project Setup](#project-setup)
- [Technologies Used](#technologies-used)
- [How to Run Tests](#how-to-run-tests)
- [Writing and Running Cucumber Tests](#writing-and-running-cucumber-tests)
- [Project Structure](#project-structure)
- [Contributions](#contributions)


## Project Setup

### Prerequisites
Ensure you have the following installed:
- **Java JDK 11** or higher
- **Maven** (for dependency management)
- **Git** (for version control)
- **ChromeDriver** or other WebDriver executables

Clone the repository to your local machine:

```bash
git clone https://github.com/khaledmohsenmohammed/-Selenium-WebDriver-4-Cucumber-BDD.git
```
# Navigate to the project directory:
```bash
cd Selenium-WebDriver-4-Cucumber-BDD
```
# Installing Dependencies
The project uses Maven for dependency management. To install all required dependencies, run:
```bash
mvn clean install
```
# Technologies Used
Java: Programming language used for writing the test scripts.
Selenium WebDriver 4: Web browser automation tool.
Cucumber BDD: For behavior-driven development and defining test scenarios using Gherkin syntax.
JUnit: Test runner for executing the test scenarios.
Maven: Dependency management and build tool.
# How to Run Tests
To execute the test scenarios, you can use Maven's test command. Run the following command in the project directory:
```bash
mvn test
```
Running Tests with Specific Browser
You can specify the browser to run the tests by passing a system property. For example, to run tests in Chrome:
mvn test -Dbrowser=chrome
Writing and Running Cucumber Tests
The feature files for Cucumber tests are located in the src/test/resources/features directory. Each feature file contains scenarios written in Gherkin syntax, which describes the behavior of the application.

Sample Gherkin syntax:
Feature: Login functionality
  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be redirected to the dashboard

You can add new feature files and corresponding step definitions to expand the test coverage.

# Project Structure
```bash
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── automation
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── stepdefinitions
│   └── resources
│       └── features
│           └── Login.feature
├── pom.xml
└── README.md
```
src/main/java: Contains the main Java classes (if any).
src/test/java: Contains the step definitions and test classes.
src/test/resources/features: Contains the Cucumber feature files.
pom.xml: Maven configuration file for dependencies and project setup.

