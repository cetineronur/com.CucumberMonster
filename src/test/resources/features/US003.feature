@US03
Feature: Onceden kaydedilmis kullanici adi ve sifresini kullanarak siteye giris yapmak istiyorum

  Scenario: TC01

    Given Given Kullanici "automationExerciseUrl" ye gider
    And Siteye giris yapildigini gorur
    Then Anasayfadaki "SignupLogin" butonu gorunur
    Then SignupLogin butonuna tiklanir
    And Login sayfasina gidilir

  Scenario: TC02

    And Login to your account formu gorunur
    Then Email Address textboxu gorunur
    And Email Address alanina gecerli email adresi girilir
    And Password textboxu gorunur
    And Password alanina gecerli sifre girilir
    Then Login butonu gorunur
    And Login butonuna tiklanir

  Scenario: TC03

    Given Gidilen sayfada "Logged in as" yazisi gorunur
