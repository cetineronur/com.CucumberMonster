package stepdefinitions.mustafa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.Mustafa;
import utilities.ConfigReader;
import utilities.Driver;

public class stepdefinitions {

    Mustafa mustafa=new Mustafa();
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();


    @Given("Launch browser")
    //Browser starten
    public void launch_browser() {
        Driver.getDriver();
    }

    @Then("Navigate to url {string}")
    //Navigieren Sie zur URL „http:automationexercise.com“.
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));

    }

    @Then("verify that home page is visible successfully")
    //Stellen Sie sicher, dass die Startseite erfolgreich sichtbar ist
    public void verify_that_home_page_is_visible_successfully() {

        String expectedTittle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTittle,actualTitle);

    }

    @Then("Click {string} for any product on home page")
    //Klicken Sie für jedes Produkt auf der Startseite auf „Produkt anzeigen“.
    public void click_for_any_product_on_home_page(String string) {

        jse.executeScript("arguments[0].scrollIntoView(true);", mustafa.elsaViewProduct);

    }

    @Then("Verify product detail is opened")
    //Vergewissern Sie sich, dass das Produktdetail geöffnet ist
    public void verify_product_detail_is_opened() {
        Assert.assertTrue(mustafa.elsaProductDetailLogo.isDisplayed());

    }

    @Then("Increase quantity to {int}")
    public void increase_quantity_to(Integer int1) {

    }

    @Then("click {string} button")
    public void click_button(String string) {

    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {

    }
}
