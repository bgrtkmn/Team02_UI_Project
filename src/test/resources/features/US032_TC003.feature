Feature:
  Scenario: TC03 Profil settings te bulunan bilgilerin doldurulması ve doğrulanması

    Given Kullanici onlineMasterMarket anasayfasina gider
    Then Ust barda login butonuna tıklar
    Then Kullanici kayıtlı e-posta adresini girer ve enter tuşuna basar
    Then Kullanici gecerli parolayı girer ve enter tuşuna basar
    Then Ust barda profil ikonuna tıklar
    And Dropdown menüden profil settings ikonu tıklar
    Then Name box'da kayıtlı kullanici adının olduğunu görüntüler
    And Name box'ta değişiklik yapılamadığını test eder
    Then E-mail box'da kayıtlı e-maili görüntüler
    And E-mail box'da değişiklik yapılamadığını test eder
    When Commercial register alanını doldurur
    Then Account Info sayfasında Account name box doldurulur
    Then Account Info sayfasında Account number box doldurulur
    Then Account Info sayfasında IBAN account box doldurulur
    And Profil settings sayfası güncellenir
