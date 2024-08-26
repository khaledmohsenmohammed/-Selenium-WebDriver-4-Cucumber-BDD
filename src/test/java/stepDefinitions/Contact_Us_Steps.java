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

import static driver.DriverFactory.getDriver;


public class Contact_Us_Steps {
    private WebDriver driver =getDriver();

    public String genratRundomeNumber (int length){
        return RandomStringUtils.randomNumeric(length);
    }

    //implement the Scenario of test cases
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN"+genratRundomeNumber(5));
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("AutoFN"+genratRundomeNumber(4));
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("AutoFN"+genratRundomeNumber(5)+"@autofn.com");
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Mohsen");
    }
    @When("I enter specific first name {word}")
    public void i_enter_specific_first_name_khaled(String firstName) {
        System.out.println("=======> : " + firstName);
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
    }

    @When("I enter specific last name {word}")
    public void i_enter_specific_last_name_mohsen(String LastName) {
        System.out.println("=======> : " + LastName);
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(LastName);
    }
    @When("I enter specific email address {string}")
    public void i_enter_specific_email_address(String string) {
        System.out.println("=======> : " + string);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);

    }
    @When("I enter specific comment {string}")
    public void i_enter_specific_comment(String string) {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(string);

    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@value=\"SUBMIT\"]")).click();

    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        // Write code here that turns the phrase above into concrete actions
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
    }

}
