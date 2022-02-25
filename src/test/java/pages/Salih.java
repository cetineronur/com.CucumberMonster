package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Salih {
    public Salih() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // mainPage/logo
    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement mainPageLogoElementi;

    // mainPage/SignUp/Login
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement mainPageSignUpLoginLinkiElementi;

    //mainPage>Login/New User Signup!
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement loginNewUserSignupTextElementi;

    //mainPage>Login/UserNameBox
    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameBoxElementi;

    //mainPage>Login/EmailBox
    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement userEmailBoxElementi;

    //mainPage>Login/signUpButonu
    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    public WebElement signUpButtonElementi;

    //mainPage>Login>signUp/hesapBilgileriniGoruntuleYazisi
    @FindBy(xpath = "(//div//b//font[@style='vertical-align: inherit;'])[1]")
    public WebElement signUpHesapBilgileriniGoruntuleYazisiElementi;

    //main>Login>signUp/TitleButton
    @FindBy(xpath = "(//input[@type=\"radio\"])[1]")
    public WebElement signUpTitleRadioButtonElementi;

    //main>Login>signUp/PasswordBox
    @FindBy(xpath = "//input[@id='password']")
    public WebElement signUpPasswordBoxElementi;

    //main>Login>signUp/Day
    @FindBy(xpath = "//select[@id='days']")
    public WebElement signUpDayDropDownElementi;

    //main>Login>signUp/Month
    @FindBy(xpath = "//select[@id='months']")
    public WebElement signUpMonthDropDownElementi;

    //main>Login>signUp/Years
    @FindBy(xpath = "//select[@id='years']")
    public WebElement signUpYearDropDownElementi;

    //main>Login>signUp/newsletterCheckBox
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signUpNewsletterCheckBoxElementi;

    //main>Login>signUp/optionCheckBox
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement signUpOptionCheckBoxElementi;

    //main>Login>signUp/FirstNameBox
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement signUpFirstNameBoxElementi;

    //main>Login>signUp/countryDropDown
    @FindBy(xpath = "//select[@id='country']")
    public WebElement signUpCountrydropDownElementi;

    //main>Login>signUp/State
    @FindBy(xpath = "//input[@id='state']")
    public WebElement signUpStateElementi;

    //main>Login>SignUp/CreateAccountButton
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement signUpCreateAccountButtonElementi;

    //main>Login>signUp>AccountCreated/AccountCreatedText
    @FindBy(xpath = "//b")
    public WebElement accountCreatedTextElementi;

    //main>Login>signUp>AccountCreated/ContinueButton
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement accountCreatedContinueButtonElementi;

    //main/Logged in as usernameYazisi
    @FindBy(xpath = "(//li//a//font[@style='vertical-align: inherit;'])[19]")
    public WebElement mainLoggedInAsUserNametextElementi;

    //main/deleteAccountLinki
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement mainDeleteAccountLinkiElementi;



}
