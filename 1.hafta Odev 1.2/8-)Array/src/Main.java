public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ahmet";
        String ogrenci2 = "Ozan";
        String ogrenci3 = "Akın";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        // bunun yerine dizi oluşturarak yapalım
        System.out.println("---------------------------------");
        int[] ogrenciler = new int[3];
        ogrenciler[0] = 1;
        ogrenciler[1] = 2;
        ogrenciler[2] = 3;

        for(int i=0;i<ogrenciler.length;i++ ){

            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------------------------");
        // en çok kullanılan yöntem budur.
        for(int ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

        System.out.println("---------------------------------");
        String[] ogrenciler1 = new String[3];
        ogrenciler1[0] = "ahmet";
        ogrenciler1[1] = "ozan";
        ogrenciler1[2] = "akın";

        for(int i=0;i<ogrenciler1.length;i++ ){

            System.out.println(ogrenciler1[i]);
        }
        System.out.println("---------------------------------");
        // en çok kullanılan yöntem budur.
        for(String ogrenci:ogrenciler1){
            System.out.println(ogrenci);
        }
    }
}