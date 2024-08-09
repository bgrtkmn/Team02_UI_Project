Feature:


  Scenario:TC01 Kullanici header bölümündeki kolay linklere ulaşabilmelidir


    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda shops Linkinin görüntülendiğini test eder
    Then Shops Linkinin  aktif olduğunu test eder

    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda Categories Linkinin görüntülendiğini test eder
    Then Categories Linkinin aktif olduğunu test eder


    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda About US Linkinin görüntülendiğini test eder
    Then About US Linkinin aktif olduğunu test eder


    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda Contact Us Linkinin görüntülendiğini test eder
    Then Contactus Linkinin aktif olduğunu test eder


    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda Become a Proffesional Linkinin görüntülendiğini test eder
    Then Become a Proffesional Linkinin aktif olduğunu test eder

    Given Kullanici onlineMasterMarket anasayfasina gider
    When Ust barda Become a User Linkinin görüntülendiğini test eder
    Then Become a User Linkinin aktif olduğunu test eder


    And  Sayfayi kapatir
