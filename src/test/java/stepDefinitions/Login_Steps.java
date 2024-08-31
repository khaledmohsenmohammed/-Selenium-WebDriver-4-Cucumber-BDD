package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.Base_PO;
import pageObjects.Login_PO;




public class Login_Steps extends Base_PO {

    //to inject the loginSteps
    private Login_PO loginPo ;
    public Login_Steps (Login_PO login_Po){
        this.loginPo = login_Po ;
    }

    @Given("I acsess the WebDriver University Login page")
    public void i_acsess_the_web_driver_university_login_page() {
        loginPo.navigateTo_WebdeiverUniv_Login_Page();
    }

    @When("I enter a username {word}")
    public void i_enter_a_outline_username(String username) {
        loginPo.setUsername_textField(username);

    }
    @And("I enter pass {word}")
    public void i_enter_outline_pass(String password) {
        loginPo.setPass_textField(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPo.clickOnLogin_Button();
    }

    @Then("Verifaying the login successful")
    public void verifaying_the_login_successful() {
        loginPo.validateSuccesfulLoginMessage();
    }
    @Then("Verifying the login unsuccessful")
    public void verifaying_the_login_unsuccessful() {
        loginPo.validateUnSuccesfulLoginMessage();
    }
    @Then("I should be presented withe the following validation {}")
    public void i_should_be_presented_withe_the_following(String message) {
    loginPo.waitForAlert_And_validateText(message);
    }

}
