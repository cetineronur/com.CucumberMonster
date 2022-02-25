package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Salih;
import utilities.ConfigReader;
import utilities.Driver;

public class salih_stepdefinitions<Faker> {

    Salih salih=new Salih();    // src/test/java/pages/Salih.java > class'indan  bir obje olusturuldu.
    Actions actions=new Actions(Driver.getDriver());
    Select select;

    @Given("Launch browser, Navigate to {string}")
    public void launch_browser_navigate_to(String URL) {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("URL"));
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(salih.mainPageLogoElementi.isDisplayed());
    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
    salih.mainPageSignUpLoginLinkiElementi.click();
    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(salih.loginNewUserSignupTextElementi.isDisplayed());
    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
       actions.click(salih.userNameBoxElementi)
               .sendKeys(ConfigReader.getProperty("AECorrectName"))
               .sendKeys(Keys.TAB)
               .sendKeys(ConfigReader.getProperty("AECorrectEmail"))
               .perform();
    }
    @Then("Click {string} button")
    public void click_button(String string) {
      salih.signUpButtonElementi.click();

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
    Assert.assertTrue(salih.signUpHesapBilgileriniGoruntuleYazisiElementi.isDisplayed());
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

        actions.click(salih.signUpTitleRadioButtonElementi)
                        .sendKeys(Keys.TAB)
                                .sendKeys(ConfigReader.getProperty("AECorrectName"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("AECorrectPassword"))
                .perform();
        select=new Select(salih.signUpDayDropDownElementi);
        select.selectByIndex(28);
        select=new Select(salih.signUpMonthDropDownElementi);
        select.selectByIndex(2);
        select=new Select(salih.signUpYearDropDownElementi);
        select.selectByIndex(30);

    }
    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        salih.signUpNewsletterCheckBoxElementi.click();
        salih.signUpOptionCheckBoxElementi.click();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.click(salih.signUpFirstNameBoxElementi)
                .sendKeys("Guru")
                .sendKeys(Keys.TAB)
                .sendKeys("Tech")
                .sendKeys(Keys.TAB)
                .sendKeys("GuruTechProEducation")
                .sendKeys(Keys.TAB)
                .sendKeys("Moonstar Street, 087600 , GuruTechProEducation , Texas ")
                .perform();
        select=new Select(salih.signUpCountrydropDownElementi);
        select.selectByValue("United States");
        actions.click(salih.signUpStateElementi)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Houston")
                .sendKeys(Keys.TAB)
                .sendKeys("77007")
                .sendKeys(Keys.TAB)
                .sendKeys("+1 281-591-5547")
                .perform();

    }
    @Then("Click 'Create Account button")
    public void click_create_account_button() {
      salih.signUpCreateAccountButtonElementi.click();
    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {
        Assert.assertTrue(salih.accountCreatedTextElementi.isDisplayed());
    }





}
