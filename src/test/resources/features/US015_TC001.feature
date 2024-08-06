Feature: Kisisel hizmet talep edilebilr bir sayfa olmali

  Scenario: Personel services sayfasında filtreleme ve ilerleme yapilir

    Given adresine gider
    Then personel services basligi gorunur
    When Personel sevices e tiklanir
    And personel servisler goruntulenir
    When filtreleme ikonu goruntulenir
