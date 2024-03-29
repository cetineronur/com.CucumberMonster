Feature:
  Scenario: TC 01 Kullanici web sayfasina gidebilmeli
    Given Kullanici "url" ye gider
    And Siteye giris yapildigini gorur

  Scenario: TC02: Arama kutusuna bir urun adi yazip search yapabilmeli
    Given Kullanici Ana Sayfadaki Product linkine tiklar
    And Kullanici "ALL PRODUCTS" yazisini gorur
    And Kullanici SearchBox kutusunun gorunur oldugunu dogrular.
    Then Kullanici Arama girisine urun adini girer ve arama dugmesine tiklar

  Scenario:TC03 Arama kutusuna yazdigi bir urunun sonuclarini gorebilmeli
    Given  Kullanici "SEARCHED PRODUCTS" yazisinin gorunur oldugunu dogrular
    And Aramayla ilgili tum urunlerin gorunur oldugunu dogrular
    Then Kullanici sayfayi kapatir