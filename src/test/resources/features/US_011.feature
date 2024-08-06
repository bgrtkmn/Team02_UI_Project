@wip
Feature: Bir kullanici olarak Tasinma ve Tasimaya ait sirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum


  Background: Kullanicinin anasayfaya gidip goruntulemesi
    Given Kullanici "ommURL" gider
    When  kullanici anasayfayi goruntuler.


  Scenario: TC01 Kullanici header bolumundeki Categories'in altindaki Moving & Transportation'i goruntuleyebilmeli
    Given Kullanici header bolumundeki categories'in ustune gelir
    Then Kullanici Moving & Transportationu goruntuler

  Scenario: TC02 Kullanici olarak header bolumundeki Categoriesin kullanilmasi
    Given Kullanici header bolumundeki categories'in ustune gelir
    When Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.
    Then İlgili ekranda Shop ve Service'i goruntuler

  Scenario: TC03 Kullanici Categories bolumundeki Movingv & Transportation - Shops - Visit Store bolumunden sirket bilgilerini goruntuleyebilmeli
    Given Kullanici header bolumundeki categories'in ustune gelir
    When Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.
    When Kullanici Shops'a tiklar
    Then Kullanici Visit Store'a goruntuler


  Scenario: TC04 Kullanici Visit Store üzerinden Sirkete ait bilgileri goruntuleyebilmeli
    Given Kullanici header bolumundeki categories'in ustune gelir
    When Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.
    When Kullanici Shops'a tiklar
    When Kullanici Visit Store'a tiklar
    Then Kullanici sirket bilgilerini goruntuler

  Scenario: TC05 Kullanici sectigi sirkete ait Service Provider, Service Availability, Service Details, Additional Services, Reviews ve Related Services alanlarini goruntuleyebilmeli
    Given Kullanici header bolumundeki categories'in ustune gelir
    When Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.
    When Kullanici Shops'a tiklar
    When Kullanici Visit Store'a tiklar
    When Kullanici Local Moving hizmetini secer
    Then Kullanici Service Provider, Service Availability, Service Details, Additional Services, Reviews ve Related Services alanlarini goruntuler

  Scenario: TC06 Kullanici Shops ve Services bolumlerinde filtreyle bilgileri degistirebilmeli
    Given Kullanici header bolumundeki categories'in ustune gelir
    When Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.
    When Kullanici Services'e tiklar
    And Kullanici 2 saniye bekler
    When Kullanici Filter iconuna tiklar
    When Kullanici Filter bilgilerini goruntuler
    When Kullanici Shops'a tiklar
    And Kullanici 2 saniye bekler
    When Kullanici Filter bilgilerini goruntuler


  Scenario: TC07 Kullanici Shops ve Services bolumlerindeki filtrelerden değişiklik yapabilmeli
    Given Kullanici header bolumundeki Shop'un ustune gelir
    When Kullanici Services'e tiklar
    When Kullanici Filter iconuna tiklar
    When Kullanici Categories bolumune tiklar ve Home Services'i secer.
    And Kullanici 2 saniye bekler
    When Kullanici Sub Category'i Cleaning olarak secer.
    When Kullanici Search butonuna tiklar.
    Then Kullanici sayfada Full House Cleaning'i gorntuler.

  Scenario:  TC08 Kullanici Shops ve Services bolumunden filtreleme ile Personel - Beauty olarak filtreleyip HairCut bilgisini goruntulemeli

    Given Kullanici header bolumundeki Shop'un ustune gelir
    When Kullanici Services'e tiklar
    When Kullanici Filter iconuna tiklar
    When Kullanici Categories bolumune tiklar ve Personel Services'i secer.
    And Kullanici 2 saniye bekler
    When Kullanici Sub Category'i Beauty olarak secer.
    When Kullanici Search butonuna tiklar.
    Then Kullanici sayfada HairCut'i goruntuler









