Feature: Bir kullanici olarak Ev Hizmetler'ine ait şirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Scenario: Kullanici Home servis sayfasındaki Shops ve servis altındaki fonksiyonlarını test eder.


    * Given Kullanici  Shops ve Service Butonuna Tıklar.
    * When Kullanici  acılan sayfada filter ikonunu görüntüler ve tıklar.
    * Then Kullanici Acılan Search Formda Location, Sory By, Keyword, Categories, Sub Category, Prince Range alanlarını görüntüler.