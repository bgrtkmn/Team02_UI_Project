Feature:

  gScenario:TC04 Seçilen servis sayfasında detaylara erişilebilmelidir

    Given Kullanici onlineMasterMarket anasayfasina gider
    When  Moving & transportation kartına tıklar
    Then  Moving & transportation'da shops butonuna tıklar

    Then  Moving & transportation shops listesinde bulunan kartta visit store butonuna tıklar
    Then  Seçili serviste shops detail bölümünü görüntülenir
    Then  Seçili serviste shop avaibility bölümünü görüntüler
    Then  Seçili serviste servis listesini görüntüler
    And  Sayfayi kapatir





