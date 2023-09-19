public abstract class GameCalculator {
    // bir sınıfın abstract olması için abstract ile beslenmesi gereklidir.
    // abstract sınıflar asla new'lenemez;

    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
