public class Main {
    public static void main(String[] args) {
        // mükemmel sayı, örneğin 6 mükemmel sayıdır çünkü 1e 2e ve 3e bölünür toplamları 6 yapar
        // 28 -> 1,2,4,7,14
        int number = 28;
        int total = 0;

        for (int i=1;i<number;i++){
            if (number % i ==0){
                total = total + i;

            }

        }
        if (total == number){
            System.out.println("mükemmel sayıdır");
        }else
            System.out.println("mükemmel sayı değildir");
    }
}