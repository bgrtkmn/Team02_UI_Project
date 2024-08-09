Feature:


  Scenario: TC03‘Shops’ butonu ile erişilen sayfada servisler ve ‘visit Store’ butonunun görüntülenmeli ve çalıştırılmalıdır


    Given Kullanici onlineMasterMarket anasayfasina gider
    Then Moving & transportation kartına tıklar
    When Moving & transportation'da shops butonuna tıklar
    Then Moving & transportation'da Shops butonunu altında Shops listesini görüntüler
    When Moving & transportation shops listesinde bulunan kartta visit store butonunu görüntüler
    And Moving & transportation shops listesinde bulunan kartta visit store butonunun aktif oldugunu test eder





