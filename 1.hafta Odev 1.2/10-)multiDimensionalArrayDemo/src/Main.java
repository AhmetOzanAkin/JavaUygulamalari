public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "gaziantep";
        sehirler[0][2] = "ankara";
        sehirler[1][0] = "izmir";
        sehirler[1][1] = "bursa";
        sehirler[1][2] = "adana";
        sehirler[2][0] = "mersin";
        sehirler[2][1] = "hatay";
        sehirler[2][2] = "diyarbakır";

        for (int i=0;i<=2;i++){
            System.out.println("----------------------");
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}