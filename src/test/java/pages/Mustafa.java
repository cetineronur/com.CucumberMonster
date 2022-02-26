package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Mustafa {

    public Mustafa() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//i[@class='fa fa-plus-square'])[11]")
    public WebElement elsaViewProduct;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public  WebElement elsaProductDetailLogo;


}
