public class Main {
    public static void main(String[] args) {

        // GameCalculator gameCalculator = new GameCalculator(); = kullanamıyoruz. abstract sınıflar new'lenemez;
        GameCalculator gameCalculator = new WomanGameCalculator(); // bu şekilde kullanabiliriz.
        gameCalculator.hesapla();
    }
}