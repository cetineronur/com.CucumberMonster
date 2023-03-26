package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BergFreunde {

    public  BergFreunde(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[text()='ALLE AUSWÄHLEN']")
    public WebElement cookie;

    @FindBy(xpath = "//input[@name='lgn_usr']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='lgn_pwd']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='header-login usr-elem']")
    public WebElement einloggen;

    @FindBy(xpath = "//button[@name='lgn_submit']")
    public WebElement einloggen1;

    @FindBy (xpath = "(//i[@class='icon login'])[1]")
    public WebElement login;

    @FindBy(xpath="//*[@id=\"main-navigation\"]/ul/li[2]/div/div[1]/a")
    public WebElement menuSchuhe;

    @FindBy(xpath="//*[@id=\"list\"]/div[2]/div[1]/div[4]/div/a/img")
    public WebElement menuSchuheSandalen;

    @FindBy(xpath = "(//img[@class='product-image'])[1]")
    public WebElement beispielSchuhe;

    @FindBy(xpath = "//*[@id=\"js-varlist-color\"]/li[1]/a/img")
    public WebElement farbe;

    @FindBy(xpath = "//*[@id=\"js-varlist-size\"]/li[1]/a")
    public WebElement grosse;

    @FindBy(xpath = "//*[@id=\"addToCartButton_3c8ffeb7db0bfe8203895d977f41e\"]")
    public WebElement inDenWarenkorb;

    @FindBy(xpath = "//button[@id='toBasketButton']")
    public WebElement zumWarenkorb;

    @FindBy(xpath = "(//button[@title='zur Kasse gehen'])[2]")
    public WebElement zurKasseGehen;

    @FindBy(xpath = "//input[@name='invadr[oxuser__oxfname]']")
    public WebElement vornameTextBox;

    @FindBy(xpath = "//input[@name='invadr[oxuser__oxlname]']")
    public WebElement nachnameTextBox;

    @FindBy(xpath = "//select[@name='invadr[oxuser__oxcountryid]']")
    public WebElement land;

    @FindBy(xpath = "(//button[@title='weiter zur Zahlungsart'])[1]")
    public WebElement weiterzurzahlung;

    @FindBy(xpath = "(//label[@class='payment-method-header'])[4]")
    public WebElement sofortUberweisung;

    @FindBy(xpath = "//button[@class='a-button a-button--green right a-button--large no-padding-left-small no-padding-right-small confirm-button']")
    public WebElement bestellungUberprufen;

    @FindBy(xpath = "//div[@class='address-and-payment']//div[1]//div//div//div//div[2]")
    public WebElement strasse;

    @FindBy(xpath = "(//div[@class='callout clearfix'])[1]//div[3]")
    public WebElement plz;

    @FindBy(xpath = "//li[@data-codecept='available-true']")
    public List<WebElement> grosseList;

    @FindBy(xpath = "//li[@class='js-available']")
    public List<WebElement> farbeList;
}
