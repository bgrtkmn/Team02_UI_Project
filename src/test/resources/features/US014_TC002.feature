Feature: Bir kullanici olarak Ev Hizmetler'ine ait şirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Scenario: Kullanici Home servis sayfasındaki Shops ve servis altındaki fonksiyonlarını test eder.


    * Given Kullanici Açılan şirketin sayfasında Shop Details, Shop Availability, Services Görüntüler
    * When Kullanici şirketin sayfasında services butonuna tıklar ve hizmetleri görüntüler
    * Then Kullanici şirketin sayfasındaki hizmet kartlarında hizmeti veren şirketin ismi, amount bilgisi, Location'ı görüntüler.
