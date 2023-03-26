package stepdefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.Amazon;
import utilities.ConfigReader;
import utilities.Driver;

public class Google {

    Amazon amazon =new Amazon();

    @Given("siteyi acar")
    public void siteyi_acar() {
        Driver.get().get(ConfigReader.getProperty("url3"));
    }

    @Given("gmail ve bildera tiklar")
    public void gmail_ve_bildera_tiklar() {
        amazon.akzept.click();
        for (WebElement each:amazon.google    ) {
            System.out.println(each.getAttribute("href"));
            each.click();
            Driver.get().navigate().back();
        }
    }

}
