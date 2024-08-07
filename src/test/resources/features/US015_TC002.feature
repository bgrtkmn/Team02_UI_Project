Feature: Kisisel hizmet talep edilebilr bir sayfa olmali

  Scenario: Personel services sayfasında filtreleme ve ilerleme yapilir

    Given adresine gider
    Then personel services basligi gorunur
    When Personel sevices e tiklanir
    And shops ikonuna tiklanir
    When visit store ikonu goruntulenir ve tiklanir
    * servisler goruntulenir
    * genel bilgiler goruntulenir
