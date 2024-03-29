package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AE_stepdefinitions {

AEPage aePage = new AEPage();

    @Given("Kullanici {string} ye gider")
    public void kullanici_ye_gider(String string) {
        Driver.get().get(ConfigReader.getProperty("automationExerciseUrl"));
    }
    @Given("Siteye giris yapildigini gorur")
    public void siteye_giris_yapildigini_gorur() {
        String expectedUrl = ConfigReader.getProperty("automationExerciseUrl");
        String actualUrl = Driver.get().getCurrentUrl().toString();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("Kullanici Ana Sayfadaki Product linkine tiklar")
    public void kullanici_ana_sayfadaki_product_linkine_tiklar() {
        //ReusableMethods.waitFor(1);
        aePage.products.click();
        //int boyut = Driver.get().findElements(By.tagName("iframe")).size();
        Driver.get().switchTo().frame(0).navigate().back();
        //aePage.iframe.click();
        Driver.get().switchTo().defaultContent();
        aePage.products.click();

    }

    @Given("Kullanici {string} yazisini gorur")
    public void kullanici_yazisini_gorur(String aranansonuc) {
        String sonucYazisi=aePage.allproducts.getText();
       Assert.assertTrue(sonucYazisi.contains(aranansonuc));
    }
    @Given("Kullanici SearchBox kutusunun gorunur oldugunu dogrular.")
    public void kullanici_search_box_kutusunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(aePage.searchBox.isDisplayed());
    }
    @Then("Kullanici Arama girisine urun adini girer ve arama dugmesine tiklar")
    public void kullanici_arama_girisine_urun_adini_girer_ve_arama_dugmesine_tiklar() {
        aePage.searchBox.sendKeys("jeans");
        aePage.searchBoxTik.click();
    }
    @Given("Kullanici {string} yazisinin gorunur oldugunu dogrular")
    public void kullanici_yazisinin_gorunur_oldugunu_dogrular(String aranansonuc) {
        String sonucYazisi=aePage.searchedProduct.getText();
        Assert.assertTrue(sonucYazisi.contains(aranansonuc));
    }

    @Given("Aramayla ilgili tum urunlerin gorunur oldugunu dogrular")
    public void aramayla_ilgili_tum_urunlerin_gorunur_oldugunu_dogrular() {
        for (WebElement each:aePage.searchedProductsList) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
            jse.executeScript("arguments[0].scrollIntoView()",each);
            Assert.assertTrue(each.getText().contains("Jeans"));
            ReusableMethods.waitFor(1);
        }
    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.close();
    }

}
