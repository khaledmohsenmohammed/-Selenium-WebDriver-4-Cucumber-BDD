package pageObjects;

import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class ContactUs_PO extends Base_PO {
    //input[@name='first_name']
    private @FindBy (xpath = "//input[@name='first_name']")
    WebElement firstName_textField  ;
  // another way for xpath
    private @FindBy (how = How.XPATH , using ="//input[@name='last_name']" )
    WebElement lastName_textField  ;

    private @FindBy (xpath = "//input[@name='email']")
    WebElement emailAddress_textField  ;

    private @FindBy (xpath = "//textarea[@name='message']")
    WebElement uniqueComment_textField  ;

    private @FindBy (xpath = "//input[@value=\"SUBMIT\"]")
    WebElement clickSubmitButton ;

    private @FindBy (xpath = "//div[@id='contact_reply']/h1")
    WebElement contactUs_Submission_Message ;

    //constructor
    public ContactUs_PO (){
        super();
    }
    public void navigateTo_WebdeiverUniv_ContactUs() {
        navigateTo_URL(Global_Vars.URL + "Contact-Us/contactus.html");
    }

    public void setFirstName_textField (String first_name) {
        sendKey(firstName_textField , first_name);
    }

    public void setLasttName_textField (String last_name) {
        sendKey(lastName_textField , last_name);
    }

    public void setEmailAddress_textField (String email) {
        sendKey(emailAddress_textField , email);
    }

    public void setUniqueComment_textField (String comment) {
        sendKey(uniqueComment_textField , comment);
    }
    public void clickSubmitButton () {
        waitForWebElementAndClick(clickSubmitButton);
    }

    public void  validateCommentSubmit (){
        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
    }
}
