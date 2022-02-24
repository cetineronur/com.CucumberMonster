package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Sezen {

    public Sezen() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
