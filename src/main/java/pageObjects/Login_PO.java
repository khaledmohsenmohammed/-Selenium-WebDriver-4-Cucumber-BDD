package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;


public class Login_PO extends Base_PO {
    //page object annotation
    private @FindBy(id = "text")
    WebElement username_textField;

    private @FindBy(id = "password")
    WebElement pass_textField;

    private @FindBy(id = "login-button")
    WebElement login_button ;

    //constructor for the
    public Login_PO() {
        super();
    }
    //
    public void navigateTo_WebdeiverUniv_Login_Page() {
        navigateTo_URL(Global_Vars.URL +"Login-Portal/index.html");
    }
    //get username field
    public void setUsername_textField(String username) {
        sendKey(username_textField, username);
    }
    //get password field
    public void setPass_textField(String pass) {
        sendKey(pass_textField, pass);
    }
    //Clicked into Button
    public void clickOnLogin_Button () {
        waitForWebElementAndClick (login_button);
    }
    public void validateSuccesfulLoginMessage() {
        waitForAlert_And_validateText("validation succeeded");
    }
    public void validateUnSuccesfulLoginMessage() {
        waitForAlert_And_validateText("validation failed");
    }

}
