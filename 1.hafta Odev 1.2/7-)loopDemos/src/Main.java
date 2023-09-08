public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for(int i=0;i<10;i++){
            System.out.println(i);

        }
        System.out.println("for döngüsü bitti");


        int i = 0;
        while (i<10){

            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");

        int j = 100;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While döngüsü bitti");
    }
}