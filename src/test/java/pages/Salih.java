package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Salih {
    public Salih() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // mainPage>logo
    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement mainPageLogoElementi;
    // mainPage>SignUp/Login
    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement mainPageSignUpLoginLinkiElementi;
    //mainPage>Login>New User Signup!
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement loginNewUserSignupTextElementi;


}
