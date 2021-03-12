# kumanda
KGF isimli bir firma farklı cihazları yönetmek için kumanda üretimi yapmaktadır. 
Bu kapsamda firma bünyesinde hali hazırda Televizyon, Klima olmak üzere 2 farklı türde kumanda üretimi yapılmaktadır. 
İlerleyen zamanlarda yeni tür araçlar için kumandalar üretilmesi planlanmaktadır. Firmanın üreteceği her kumandada 
firmanın ismi olacak ve değiştirilmeyecektir. Kumandaya ait tuş sayısı, pil sayısı, üretim tarihi, cihaz durum gibi 
değişkenler bulunmalıdır.  Her kumandada cihaz aç, kapat ve pil bitiyor fonksiyonları bulunmalıdır.  
Televizyon kumandası hangi televizyon markası için üretildiği bilgisini barındırmalıdır. Ve bu bilgi değiştirilmemelidir.
Televizyon kumandası içinde ne tür pil kullandığına dair Pil sınıfından bir nesne tutulmalıdır. Bunun yanında ses, kanal gibi özel 
değişkenleri olmalı bu değişkenlere sınıftan bir nesne oluşturulacağı zaman ilk değerleri atılmalıdır. Televizyon kumandası eğer
cihaz durum açık ise ses arttır veya azalt, kanal ileri-geri, istenilen kanala git gibi kendine has özellikler içermelidir.
Ses arttırma ve kapama işlemi yalnızca birer adımda çalışmalıdır. Yani arttır veya azalt düğmesine her basmada sistem birer 
birer azaltma ya da arttırma yapmalıdır. Televizyon sesi 0’ın altına düşmemeli, 30’un ise üzerine çıkmamalıdır.  Kanal ileri 
geri işleminde ses açmada olduğu gibi her düğmeye basışta bir kanal ileri veya geri gitmelidir. Tabi televizyon durumu açık ise kanal değişmelidir. 
Televizyon toplamda 500 kanala sahiptir. 1’in altına ya da 500 üzerine çıkmasına izin verilmemelidir. İstenilen kanala git fonksiyonunda ise 
kullanıcı televizyon açık ise 1-500 arasında istediği bir kanalı tuşlayarak gidebilmelidir. Bunun haricinde ise farklı firmaların farklı 
modellerinde akıllı televizyon özelliği yer almaktadır. Bu kapsamda internete gir, uygulama yükle, wifiye bağlan gibi özellikleri içeren
televizyon kumandaları olabileceği de göz önünde bulundurulmalıdır. Öte yandan klima kumandası hangi firma için üretildiği bilgisini 
barındırmalı ve bu değer değiştirilebilir olmamalıdır. Buna ek olarak mevcut sıcaklık gibi bir özelliği ve Pil türünden bir nesneyi
bünyesinde barındırmalıdır. Bunun yanında sıcaklık attır, sıcaklık azalt, istenilen sıcaklığa git gibi fonksiyonları bulunmaktadır. 
Sıcaklık eğer klima açık ise birer birer azaltılmalı ya da arttırılmalıdır. Yalnızca istenilen sıcaklığa git fonksiyonu ile cihaz 
açık olduğu durumlarda istenilen sıcaklığa gitme durumu olmaktadır. Sıcaklık değeri 10 ila 43 derece arasında olmalıdır. Öte yandan 
bazı klimaların turbo soğutma ve ısıtma özelliği bulunmaktadır. Televizyon kumandası sınıfından üretilen her bir nesne için 
“TV-xxxxxxx” şekilde “x” ‘ler yerine (0-9) arası rastgele sayılardan oluşan bir id değeri olmalıdır.  Klima kumandası sınıfından
üretilen her bir nesne için “KL-xxxxxxx” şekilde “x”’ler yerine (0-9) arası rastgele sayılardan oluşan bir id değeri olmalıdır. 
Firma ayrıca kaç tane televizyon ve klima kumandası ürettiğini ayrı ayrı bilmek istemektedir. Bunun yanında kumandalar farklı 
tiplerde pil kullanmaktadır. Bu pillere ait voltaj değeri ve pilin türü olmalıdır. 
Yukarıda verilen senaryonun UML sınıf diyagramını çiziniz.  Çizdiğiniz diyagrama göre senaryoyu java dilinde kodlayınız. 
