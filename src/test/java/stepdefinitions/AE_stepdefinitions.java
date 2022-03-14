package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AE_stepdefinitions {
AEPage aePage = new AEPage();


    @Given("Given Kullanici {string} ye gider")
    public void given_kullanici_ye_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
    }
    @Given("Siteye giris yapildigini gorur")
    public void siteye_giris_yapildigini_gorur() {
        String expectedUrl = ConfigReader.getProperty("automationExerciseUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl().toString();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    // zeynep

    @Then("Anasayfadaki {string} butonu gorunur")
    public void anasayfadakiSignupLoginButonuGorunur() {
        Assert.assertTrue("Login linki gorundu", aePage.mainPageSignupLoginLinkiElementi.isDisplayed());
    }
    @Then("Anasayfadaki {string} butonuna tiklanarak Login sayfasina gidilir")
    public void anasayfadakiSignupLoginButonunaTiklanarakLoginSayfasinaGidilir() {
        aePage.mainPageSignupLoginLinkiElementi.click();
    }
    @Then("Login to your account formu gorunur")
    public void login_to_your_account_formu_gorunur() {
        Assert.assertTrue(aePage.loginToYourAccountYazisi.isDisplayed());
    }
    @Then("Email Address textboxu gorunur")
    public void email_address_textboxu_gorunur() {
        Assert.assertTrue(aePage.loginEmailTextBox.isDisplayed());
    }
    @Then("Email Address alanina gecerli email adresi girilir")
    public void email_address_alanina_gecerli_email_adresi_girilir() {
        aePage.loginEmailTextBox.sendKeys(ConfigReader.getProperty("loginEmail"));
    }
    @Then("Password textboxu gorunur")
    public void password_textboxu_gorunur() {
        Assert.assertTrue(aePage.passwordTextBox.isDisplayed());
    }
    @Then("Password alanina gecerli sifre girilir")
    public void password_alanina_gecerli_sifre_girilir() {
        aePage.passwordTextBox.sendKeys(ConfigReader.getProperty("loginPassword"));
    }
    @Then("Login butonu gorunur")
    public void login_butonu_gorunur() {
        Assert.assertTrue(aePage.loginButton.isDisplayed());
    }
    @Then("Login butonuna tiklanir")
    public void login_butonuna_tiklanir() {
        aePage.loginButton.click();
    }
    @Given("Gidilen sayfada {string} yazisi gorunur")
    public void gidilen_sayfada_yazisi_gorunur(String string) {
        Assert.assertTrue(aePage.loggedInAsYazisi.isDisplayed());
    }

}
