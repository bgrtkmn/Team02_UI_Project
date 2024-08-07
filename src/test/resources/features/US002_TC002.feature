Feature:


  Scenario: TC02 Kullanıcı header’da login butonunu görüntülemeli ve calistirmalidir

    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda login Linkinin görüntülendiğini test eder
    Then Login Linkinin aktif olduğunu test eder
    And Sayfayi kapatir