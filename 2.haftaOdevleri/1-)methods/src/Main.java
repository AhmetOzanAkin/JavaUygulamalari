public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int [] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi:sayilar){
            if (aranacak==sayi){
                varMi = true;
                break;
            }
        }
        if (varMi){
           mesajVer(aranacak);
        }else
            System.out.println("sayi mevcut değildir:"+aranacak);

    }
    public static void mesajVer(int aranacak){
        System.out.println("sayi mevcuttur:"+aranacak);

    }
}