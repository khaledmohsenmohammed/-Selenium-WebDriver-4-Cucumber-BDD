package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;

import static driver.DriverFactory.getDriver;


public class Contact_Us_Steps extends Base_PO {
    private WebDriver driver =getDriver();

    private ContactUs_PO contactUsPo ;

    public Contact_Us_Steps (ContactUs_PO contactUs_po) {
        this.contactUsPo = contactUs_po ;
    }
    //implement the Scenario of test cases
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUsPo.navigateTo_WebdeiverUniv_ContactUs();
    }

    /**
     * Step definition for entering a unique first name in a form field.
     *
     * This method simulates the action of a user entering a unique first name into a text input field identified by
     * its 'name' attribute. The first name is generated dynamically by appending a random 5-digit number to the prefix "AutoFN".
     * The generated name is then entered into the input field using the `sendKey` method, ensuring that the field is
     * ready to accept input before typing the text.
     */

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPo.setFirstName_textField("AutoFN"+genratRundomeNumber(5));
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPo.setLasttName_textField("AutoFN"+genratRundomeNumber(4));
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPo.setEmailAddress_textField("AutoFN"+genratRundomeNumber(5)+"@autofn.com");
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
      contactUsPo.setUniqueComment_textField("Mohsen");
    }
    @When("I enter specific first name {word}")
    public void i_enter_specific_first_name_khaled(String firstName) {
        System.out.println("=======> : " + firstName);
        contactUsPo.setFirstName_textField(firstName);
    }

    @When("I enter specific last name {word}")
    public void i_enter_specific_last_name_mohsen(String LastName) {
        System.out.println("=======> : " + LastName);
        contactUsPo.setLasttName_textField(LastName);
    }
    @When("I enter specific email address {string}")
    public void i_enter_specific_email_address(String string) {
        System.out.println("=======> : " + string);
        contactUsPo.setEmailAddress_textField(string);
    }
    @When("I enter specific comment {string}")
    public void i_enter_specific_comment(String string) {
    contactUsPo.setUniqueComment_textField(string);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
       contactUsPo.clickSubmitButton();
    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPo.validateCommentSubmit();
    }

}
