Feature:



  Scenario: TC02 Moving& transportation sayfasındaki butonlar görüntülenmeli ve çalışmalıdır

    Given Kullanici onlineMasterMarket anasayfasina gider
    Then Moving & transportation kartına tıklar
    When  Moving & transportation'da Shops butonunu görüntüler
    Then Moving & transportation'da Shops butonunun aktif oldugunu test eder
    Then  Moving & transportation'da Service butonunu görüntüler
    And  Moving & transportation'da Service butonunun aktif oldugunu test eder