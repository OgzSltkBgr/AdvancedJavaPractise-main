package P07_GeometrikHesaplama;

public class Dikdörtgen extends Sekıl{
    public Dikdörtgen() {
    }

    public Dikdörtgen(int kısaKenar, int uzunKenar) {
        super(kısaKenar, uzunKenar);
    }

    public void alanHesapla(){
       double alan=kısaKenar*uzunKenar;
        System.out.println(alan);
    }
    public void cevreHesaplama(){
       double cevre=2*(kısaKenar+uzunKenar);
        System.out.println(cevre);
    }
}
