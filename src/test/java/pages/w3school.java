package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class w3school {

    public  w3school(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath="//table[1]//tr//td")
    public List<WebElement> allecell;

    @FindBy(xpath = "//table[1]//tr")
    public List<WebElement> allerow;

    @FindBy(xpath="//table//th")
    public List<WebElement> basliklar;

    @FindBy(css = "#accept-choices")
    public WebElement akzeptieren;
}
