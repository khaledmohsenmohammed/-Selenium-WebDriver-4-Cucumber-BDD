package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;


public class Login_Steps  {
    private WebDriver driver =getDriver();

    @Given("I acsess the WebDriver University Login page")
    public void i_acsess_the_web_driver_university_login_page() {
    driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html");
    }
    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }
    @And("I enter pass {string}")
    public void i_enter_pass(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("Verifaying the login successful")
    public void verifaying_the_login_successful() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation succeeded");
    }
    @Then("Verifying the login unsuccessful")
    public void verifaying_the_login_unsuccessful() {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, "validation failed");
    }

    @When("I enter a username {word}")
    public void i_enter_a_outline_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);

    }
    @And("I enter pass {word}")
    public void i_enter_outline_pass(String pass) {
        driver.findElement(By.id("password")).sendKeys(pass);
    }
    @Then("I should be presented withe the following validation {}")
    public void i_should_be_presented_withe_the_following(String message) {
        String login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message, message);
    }

}
