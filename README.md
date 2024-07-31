⚠ ⚠ ⚠ ⚠ ⚠ KURULUM YAPMADAN ÖNCE OKUYUNUZ ⚠ ⚠ ⚠ ⚠ ⚠

1. Proje Framework'ü bilgisayarınıza "clone" yapılarak indirilmelidir.
"Clone" işlemi için bilgisayarınıza yüklü IDE'nizi açınız.
"Main menü" sekmesinden "New" ardından da "Project from version control" sekmesine tıklayın. 
Açılan pencerede "Repository URL" sekmesini seçin ve "URL" kutucuğuna aşağıdaki linki
"https://github.com/bgrtkmn/Team02_UI_Project.git" linkini kopyalayıp yapıştırın. 
En sonda da "clone" butonuna basın.

2. Bilgisayarınıza "Git" yüklü olmalıdır. Eğer yüklü değil ise aşağıdaki linkten indirebilirsiniz.
https://git-scm.com/downloads

3. IDE'yi çalıştırın ve terminali açın. Açılan terminale "git init" yazarak "Git" i çalıştırın.

4. Configuration.properties dosyası ".gitignore" dosyasına eklenmelidir. Aksi halde kodlar çakışacak ve 
sorun yaşanacaktır. Eklemekte sorun yaşıyorsanız teknik destekten yardım alabilirsiniz.

5. BDD formatında ve "Gherkin" dilinde hazırlanacak dosyalar " resources > features > US_XXX.feature " adlı dosya dizini altında yapılmalıdır.
   
6. "stepdefinitions" klasörü altında .java uzantılı dosyalar oluşturulacak ve kodlar buraya yazılacaktır.
   
7. ".feature" isimli dosyalarınızın yanında eğer "cucumber" ikonu görünmüyorsa " Main menu > Settings > Plugins > Market Place " sekmesinden
"Cucumber for java , Gherkin , Lombok " eklentilerini indirip IDE'yi yeniden başlatın.

8. Kodlarınızı yazdıktan sonra proje boyunca karışıklık yaşanmaması için kendizi ait "branch" ta çalışmanız ve "git push" işlemini
buradan yapmanız gerekmektedir.
Kendi isminizle branch oluşturmak için terminale "git branch isminiz"  yazınız. "git branch" yazarak hangi branch üzerinde olduğunuzu öğrenebilirsiniz. 
Üzerinde bulunduğunuz branch " * " ile gösterilecektir.
Branch değiştirmek için " git switch branchadı " yazınız.
Kodlarınızı yazıp göndermek istediğiniz zaman sırasıyla;
" git add . "
" git commit -m "yaptıgınız degisiklikle ilgili bilgilendirme mesajı zorunludur"
" git push "
yazmalısınız.

Herhangi bir sorunlu karşılaştığınızda "Teknik Desteğe" başvurabilirsiniz.

--------------------------------------------------------------------------------------------------------
