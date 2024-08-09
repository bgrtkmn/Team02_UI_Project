Feature: Bir kullanici olarak Ev Hizmetler'ine ait şirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Scenario: Kullanici Home servis sayfasındaki Shops ve servis altındaki fonksiyonlarını test eder.


    * Given URL’e gider.
    * When Header bölümünden Categories altındaki Home Service’i görüntüler ve tıklar.
    * Then Shops ve service Butonlarini Tıklar.
    * Then Şirket kartında Visit Store ikonu tiklar ve gorunur ve aktif olmalidir
    * And şirket bilgilerine, Shop Details ve Services alanlarına ve 'Shop Availability' card'ina erişilebilmelidir.
