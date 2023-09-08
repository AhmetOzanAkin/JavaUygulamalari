public class Main {
    public static void main(String[] args) {
        Double[] myList = {1.2, 3.4, 5.6, 7.8};
        double total = 0;
        double max = myList[0];

        for (double list : myList) {
            if (max < list) {
                max = list;
                // en büyük değeri bulan kod
            }
            System.out.println(list);
            total = total + list;
            // sayıların toplamı

        }
        System.out.println("toplam = " + total);
        System.out.println("en büyük sayı = " + max);
    }
}