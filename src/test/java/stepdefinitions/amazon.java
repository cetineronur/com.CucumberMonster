package stepdefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Amazon;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class amazon {

    Amazon amazon =new Amazon();

    @Given("kullanici url ye gider")
    public void kullanici_url_ye_gider() {
        Driver.get().get(ConfigReader.getProperty("url2"));
    }

    @Given("arama kutusundan arama yapar")
    public void arama_kutusundan_arama_yapar() {
        amazon.findBox.sendKeys("Iphone", Keys.ENTER);

    }

    @Given("arama sonuclarini degerlendirir")
    public void arama_sonuclarini_degerlendirir() {
        for (WebElement each:amazon.tumurunler) {

            WebElement punkte = each.findElement(By.cssSelector("[aria-label~='Sternen']"));
            System.out.println("Puan = " + punkte.getAttribute("aria-label"));

            WebElement fiyat = each.findElement(By.cssSelector(".a-price-whole"));
            System.out.println("fiyat = " + fiyat.getText());

            WebElement isim= each.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
            System.out.println("isim = " + isim.getText());
        }

    }
}
