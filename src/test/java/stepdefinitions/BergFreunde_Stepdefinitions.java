package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.BergFreunde;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class BergFreunde_Stepdefinitions {

    BergFreunde berg = new BergFreunde();

    @Given("Benutzer schreibt den {string}")
    public void benutzer_schreibt_den(String string) {
        Driver.get().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
    }

    @Given("Benutzer klickt cookie")
    public void benutzer_klickt_cookie() {
        ReusableMethods.waitFor(20);
        berg.cookie.click();
    }

    @Given("Benutzer klickt Einloggen")
    public void benutzer_klickt_Einloggen() {
     berg.einloggen.click();
    }

    @Given("Benutzer schreibt eigene {string} adresse")
    public void benutzer_schreibt_eigene_adresse(String username) {
        berg.username.clear();
        berg.username.sendKeys(username);
    }

    @Then("Benutzer schreibt eigene {string}")
    public void benutzer_schreibt_eigene(String password) {
        berg.password.clear();
        berg.password.sendKeys(password);
    }

    @Then("Benutzer klickt die einloggen button")
    public void benutzer_klickt_die_einloggen_button() {
        berg.einloggen1.click();
    }

    @Then("Benutzer bewegt den Mauszeiger im Menu uber die Schuhe")
    public void benutzer_bewegt_den_Mauszeiger_im_Menu_uber_die_Schuhe() {
        ReusableMethods.waitFor(2);
        berg.menuSchuhe.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Benutzer klickt im Dropdown-Menu auf Sandalen")
    public void benutzer_klickt_im_Dropdown_Menu_auf_Sandalen() {
        ReusableMethods.waitFor(2);
        berg.menuSchuheSandalen.click();

    }

    @Then("Benutzer klickt erste Product")
    public void benutzer_klickt_erste_Product() {
        ReusableMethods.waitFor(2);
        berg.beispielSchuhe.click();

    }

    @Then("Benutzer wahlt Farbe von schuhe")
    public void benutzer_wahlt_Farbe_von_schuhe() {
        ReusableMethods.waitFor(2);
        berg.farbeList.get(0).click();
    }

    @Then("Benutzer wahlt Gorsse von schuhe")
    public void benutzer_wahlt_Gorsse_von_schuhe() {
        ReusableMethods.waitFor(2);
        berg.grosseList.get(0).click();
    }

    @Then("Benutzer klickt in den warenkorb")
    public void benutzer_klickt_in_den_warenkorb() {
        ReusableMethods.waitFor(2);
        berg.inDenWarenkorb.click();
    }

    @Then("Benutzer klickt zum warenkorb")
    public void benutzer_klickt_zum_warenkorb() {
        ReusableMethods.waitFor(3);
        ReusableMethods.slide(berg.zumWarenkorb);
    }

    @Then("Benutzer klickt zur kasse gehen")
    public void benutzer_klickt_zur_kasse_gehen() {
        ReusableMethods.waitFor(1);
        ReusableMethods.slide(berg.zurKasseGehen);
    }

    @Then("Benutzer schreibt {string} in den {string}")
    public void benutzer_schreibt_in_den(String string, String string2) {
        Driver.get().findElement(By.xpath("//input[@name='invadr[oxuser__ox"+string2+"]']")).clear();
        Driver.get().findElement(By.xpath("//input[@name='invadr[oxuser__ox"+string2+"]']")).sendKeys(string);
        Assert.assertEquals("",Driver.get().findElement(By.xpath("//input[@name='invadr[oxuser__ox"+string2+"]']")).getText());
        ReusableMethods.waitFor(1);
    }

    @Given("Benutzer schreibt {string} in den {string} box")
    public void benutzer_schreibt_in_den_box(String string, String string2) {
        Driver.get().findElement(By.xpath("//input[@id='invadr_oxuser__oxbirthdate_"+string2+"']")).clear();
        Driver.get().findElement(By.xpath("//input[@id='invadr_oxuser__oxbirthdate_"+string2+"']")).sendKeys(string);
        ReusableMethods.waitFor(1);
        //Assert.assertEquals("",Driver.get().findElement(By.xpath("//p[@id='invalid-birthdate-error']")).getText());
    }

    @Given("Benutzer wahlt den {string}")
    public void benutzer_wahlt_den(String string) {
        ReusableMethods.slide(berg.land);
        Select select = new Select(berg.land);
        select.selectByVisibleText(string);
    }

    @Then("Benutzer klickt weiter zur zahlungsart")
    public void benutzer_klickt_weiter_zur_zahlungsart() {
       berg.weiterzurzahlung.click();
        ReusableMethods.waitFor(2);
    }

    @And("Benutzer klickt sofort uberweisung")
    public void benutzerKlicktSofortUberweisung() {
        ReusableMethods.waitFor(2);
        ReusableMethods.slide(berg.sofortUberweisung);
    }

    @And("Benutzer klickt bestellung uberprufen")
    public void benutzerKlicktBestellungUberprufen() {
        ReusableMethods.waitFor(2);
        ReusableMethods.slide(berg.bestellungUberprufen);
    }

    @And("Benutzer kontrolliert strasse und strasse nummer")
    public void benutzerKontrolliertStrasseUndStrasseNummer() {
        ReusableMethods.waitFor(2);
        Assert.assertFalse(berg.strasse.getText().substring(0).contains("*"));
        Assert.assertFalse(berg.strasse.getText().substring(1).contains("."));
    }

    @And("Benutzer kontrolliert Plz und Ort")
    public void benutzerKontrolliertPlzUndOrt() {
        int plz= Integer.parseInt(berg.plz.getText().substring(0,4));
        Assert.assertFalse(plz>10000);
    }
}
