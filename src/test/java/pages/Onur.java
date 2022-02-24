package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Onur {

public Onur(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscription;

@FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement emailBox;

@FindBy(xpath = "//div[text()='You have been successfully subscribed!']")
    public WebElement message;


}
