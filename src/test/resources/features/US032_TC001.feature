Feature:

  Scenario: Kayıtlı kullanıcının ana sayfada profil ikonunu görüntülemesi ve çalışması testi

    Given  Kullanici onlineMasterMarket anasayfasina gider
     Then Ust barda login butonuna tıklar
     Then Kullanici kayıtlı e-posta adresini girer ve enter tuşuna basar
      Then 10 saniye bekler
     Then Kullanici gecerli parolayı girer ve enter tuşuna basar
    Then 10 saniye bekler
     Then Ust barda profil ikonunun görüntülendiğini test eder
     And  Ust barda profil ikonunun aktif oldugunu test eder