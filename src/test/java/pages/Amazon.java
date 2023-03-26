package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Amazon {
    public Amazon(){
       PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(css="[data-component-type='s-search-result']")
    public List<WebElement> tumurunler;

    @FindBy(id="twotabsearchtextbox")
    public WebElement findBox;

    @FindBy(xpath = "//a[@class='gb_p']")
    public List<WebElement> google;

    @FindBy(xpath = "//div[text()='Alle akzeptieren']")
    public  WebElement akzept;


}
