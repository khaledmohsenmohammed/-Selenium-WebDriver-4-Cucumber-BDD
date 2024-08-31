package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUs_PO extends Base_PO {

    private @FindBy (xpath = "//input[@name='first_name']")
    WebElement firstName_textField  ;
  // another way for xpath
    private @FindBy (how = How.XPATH , using ="//input[@name='last_name']" )
    WebElement lastName_textField  ;

    private @FindBy (xpath = "//input[@name='email']")
    WebElement emailAddress_textField  ;

    private @FindBy (xpath = "//textarea[@name='message']")
    WebElement uniqueComment_textField  ;

    //constructor
    public ContactUs_PO (){
        super();
    }
    public void navigateTo_WebdeiverUniv_ContactUs() {
        navigateTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
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
}
