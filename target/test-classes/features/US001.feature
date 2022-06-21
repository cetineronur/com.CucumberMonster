Feature: Ana Sayfadaki yazilari gorebilmek ve yonlendirmeleri kullanabilmek istiyorum

  Scenario: TC01
    Given Kullanici 'url' gider.
    And Siteye giris yapildigini gorur.


  Scenario: TC02
    Given Home WebElementini gorur
    And Product Webelementini gorur
    And Card Webelementini gorur
    And Signup/Login Webelementini gorur
    And Test Cases Webelementini gorur
    And Api Testing Webelementini gorur
    Then Contact us Webelementini gorur

  Scenario: TC03
    Given Product linkine tiklar
    And Product sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

    Given Card linkine tiklar
    And Card sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

    Given Signup/Login linkine tiklar
    And Signup/Login sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

    Given Test Cases linkine tiklar
    And Test Cases sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

    Given API Testing linkine tiklar
    And API Testing sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

    Given Contact us linkine tiklar
    And Contact us sayfasina gidildigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur

  Scenario: TC04
    Given Sliderdan birinci butona tiklar
    Then Sliderda birinci resmi gorur
    And Sliderdan ikinci butona tiklar
    Then sliderda ikinci resmi gorur
    And Sliderdan ucuncu butona tiklar
    Then Sliderda ucuncu resmi gorur

  Scenario:TC05
    Given First Slider uzerindeki Test Cases ve APIs list for Practise gorur
    And First Slider uzerindeki Test Cases butonuna tiklar
    Then Test Cases sayfasina gidildigini gorur
    And Ana sayfaya geri doner doner
    Then First Slider uzerindeki APIs list for Practise butonuna tiklar
    And Api List sayfasina gidildigini test eder
    Then Ana sayfaya geri doner


    Given Second Slider uzerindeki Test Cases ve APIs list for Practise gorur
    And Second Slider uzerindeki Test Cases butonuna tiklar
    Then Test Cases sayfasina gidildigini gorur
    And Ana sayfaya geri doner doner
    Then Second Slider uzerindeki APIs list for Practise butonuna tiklar
    And Api List sayfasina gidildigini test eder
    Then Ana sayfaya geri doner

    Given Third Slider uzerindeki Test Cases ve APIs list for Practise gorur
    And Third Slider uzerindeki Test Cases butonuna tiklar
    Then Test Cases sayfasina gidildigini gorur
    And Ana sayfaya geri doner doner
    Then Third Slider uzerindeki APIs list for Practise butonuna tiklar
    And Api List sayfasina gidildigini test eder
    Then Ana sayfaya geri doner

  Scenario: TC06
    Given Page Down yapar
    And Women sekmesine gorur
    And Women sekmesine tiklar
    Then Women sayfasina gittigini gorur

    Given Men sekmesine gorur
    And Men sekmesine tiklar
    Then Men sayfasina gittigini gorur


    Given Kids sekmesine gorur
    And Kids sekmesine tiklar
    Then Kids sayfasina gittigini gorur

  Scenario: TC07
    Given Polo sekmesine gorur
    And Polo sekmesine tiklar
    Then Polo sayfasina gittigini gorur

    Given H&M sekmesine gorur
    And H&M sekmesine tiklar
    Then H&M sayfasina gittigini gorur

    Given Madame sekmesine gorur
    And Madame sekmesine tiklar
    Then Madame sayfasina gittigini gorur

    Given Mast&Horbour sekmesine gorur
    And Mast&Horbour sekmesine tiklar
    Then Mast&Horbour sayfasina gittigini gorur

    Given Page Down yapar
    And Babyhug sekmesine gorur
    And Babyhug sekmesine tiklar
    Then Babyhug sayfasina gittigini gorur


    Given Ailen Solly Junior sekmesine gorur
    And Ailen Solly Junior sekmesine tiklar
    Then Ailen Solly Junior sayfasina gittigini gorur

    Given Kokie Kids sekmesine gorur
    And Kokie Kids sekmesine tiklar
    Then Kokie Kids sayfasina gittigini gorur

    Given Biba sekmesine gorur
    And Biba sekmesine tiklar
    Then Biba sayfasina gittigini gorur

  Scenario: TC08
    Given Features Item listesindeki son urune gider
    And Urunun altinda Add to Card butonunu gorur
    And Add to Card butonuna tiklar
    And Added yazisini gorur
    And Continue Shopping butonuna tiklar

    Given Features Item listesindeki son urune gider
    And Urunun altinda View Product linkini gorur
    And View Product linkine tiklar
    And Product sayfasina gittigini gorur
    Then Home linkine tiklar
    And Ana sayfaya gidildigini gorur


  Scenario: TC09
    Given Sayfanin sonuna gider
    And Email text box'u gorur
    And Email Text Box'a email girer
    And Send butonuna gonderir
    Then Emailin kaydedildigini gorur