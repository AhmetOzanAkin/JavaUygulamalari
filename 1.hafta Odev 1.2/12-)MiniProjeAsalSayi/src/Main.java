public class Main {
    public static void main(String[] args) {

        int number = -10;
        boolean isPrime = true;

        if (number==1){
            System.out.println("Sayı asal değildir");
           return;
        }

        if (number<1){
            System.out.println("girilen sayı geçersizdir");
            return;
        }

        for (int i=2; i<number;i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır");
        }else
            System.out.println("Sayı asal değildir");

    }
}