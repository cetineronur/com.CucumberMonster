package stepdefinitions.onur;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Onur;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class stepdefinitions {
Onur onur = new Onur();

    @Given("Launch browser, Navigate to {string}")
    public void launch_browser_navigate_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualHomePage=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.automationexercise.com/";
        Assert.assertEquals(actualHomePage,expectedUrl);
    }
    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }
    @Then("Verify text {string}")
    public void verify_text(String subscription) {
        String subsc=subscription;
        Assert.assertEquals(onur.subsc.getText(),subscription);

    }
    @Then("Enter {string} in input and click arrow button")
    public void enter_in_input_and_click_arrow_button(String email) {
        ReusableMethods.waitFor(3);
        onur.emailBox.sendKeys(email,Keys.ENTER);

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(onur.message.isDisplayed());
        Driver.closeDriver();

    }

}
