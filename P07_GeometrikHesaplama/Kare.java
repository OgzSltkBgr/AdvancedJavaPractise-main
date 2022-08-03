package P07_GeometrikHesaplama;

public class Kare extends Dikdörtgen {
    int kenar;

    public Kare() {

    }


    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public void alanHesapla() {
        double alan = kenar * kenar;
        System.out.println(alan);
    }

    public void cevreHesapla() {
        double cevre = 4 * kenar;
        System.out.println(cevre);
    }
}
