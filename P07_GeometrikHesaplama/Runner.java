package P07_GeometrikHesaplama;

public class Runner {
    public static void main(String[] args) {

        Cember cmbr1=new Cember(4);
        cmbr1.alanHesapla();
        cmbr1.cevreHesapla();

        Dikdörtgen dıkdortgen=new Dikdörtgen(4,6);
        dıkdortgen.alanHesapla();
        dıkdortgen.cevreHesaplama();

        Kare kare= new Kare(4);
        kare.alanHesapla();
        kare.cevreHesapla();

    }
}
