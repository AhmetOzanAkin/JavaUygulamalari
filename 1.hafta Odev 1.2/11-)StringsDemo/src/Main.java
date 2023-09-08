public class Main {
    public static void main(String[] args) {
        String mesaj = "     Bugün hava çok güzel";
        System.out.println(mesaj);

       /* System.out.println("eleman sayısı = "+mesaj.length()); //toplam eleman sayısını verir
        System.out.println("5. eleman = "+mesaj.charAt(6)); //6. elemanı verir
        System.out.println(mesaj.concat(" Dışarıya Çıkalım")); // 2 stringi birleştirir.
        System.out.println(mesaj.startsWith("B")); // startwith true veya false dönderir boolean bir değer atar. ilk harf büyük "B" ise true döner
        System.out.println(mesaj.endsWith("l")); // son harf küçük "l" ise true döner
        char[] karekterler = new char[10];
        mesaj.getChars(0,10,karekterler,0); // mesaj değişkenindeki ilk 10 karekteri yazdırır.
        System.out.println(karekterler);
        System.out.println(mesaj.indexOf("a")); // baştan başlayarak sayar ilk "a" harfini gördüğünde o değeri yazar
        System.out.println(mesaj.lastIndexOf("a")); // sondan başlayarak yazar ilk "a" harfini gördüğünde o değeri yazar*/

        String yenimesaj = mesaj.replace(' ', '-'); // boşlukların yerine "-" işareti koyar
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2,10)); // 2. karekter ile 10. karekter arasındaki verileri yazar.
        System.out.println(mesaj.substring(2)); // 2. karekter sonrasını yazar. yani ilk 2 karekteri yazmaz.

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime); // kelime kelime bölüp alt alta yazar
        }
        System.out.println(mesaj.toLowerCase()); // bütün harfleri küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); // bütün harfleri büyük harfe çevirir
        System.out.println(mesaj.trim()); // boşluklar yokmuş gibi yazar


    }
}