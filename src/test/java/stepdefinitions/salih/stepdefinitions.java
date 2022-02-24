package stepdefinitions.salih;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Salih;
import utilities.ConfigReader;
import utilities.Driver;

public class stepdefinitions<Faker> {

    Salih salih=new Salih();    // src/test/java/pages/Salih.java > class'indan  bir obje olusturuldu.


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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click 'Create Account button")
    public void click_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
