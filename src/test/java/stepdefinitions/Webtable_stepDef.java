package stepdefinitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.w3school;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Webtable_stepDef {

    w3school w3school = new w3school();

    @Given("kullanici web sayfasina gider")
    public void kullanici_web_sayfasina_gider() {
        Driver.get().get(ConfigReader.getProperty("url1"));
        w3school.akzeptieren.click();
    }

    @Given("siteye giris yapildigini gorur")
    public void siteye_giris_yapildigini_gorur() {
       String expectedurl=ConfigReader.getProperty("url1");
       String actualurl =Driver.get().getCurrentUrl().toString();
        Assert.assertEquals(actualurl,expectedurl);
    }
    @Given("kullanici tablodaki hucreleri ekrana yazdirir")
    public void kullanici_tablodaki_hucreleri_ekrana_yazdirir() {
        ReusableMethods.getcell();
    }

    @Given("kullanici tablodaki satirlari ekrana yazdirir")
    public void kullanici_tablodaki_satirlari_ekrana_yazdirir() {
        ReusableMethods.getalleRow();
    }

    @Given("kullanici tablodaki birinci sutunu ekrana yazdirir")
    public void kullanici_tablodaki_birinci_sutunu_ekrana_yazdirir() {
        ReusableMethods.getRow(1);
    }

    @Given("kullanici tablodaki ikinci sutunu ekrana yazdirir")
    public void kullanici_tablodaki_ikinci_sutunu_ekrana_yazdirir() {
        ReusableMethods.getRow(2);
    }

}
