package P07_GeometrikHesaplama;

public class Cember extends Sekıl{

    public Cember() {
    }

    public Cember(int yarıcap) {
        this.yarıcap=yarıcap;
    }


    public void alanHesapla(){
        double alan=3.14*(yarıcap*yarıcap);
        System.out.println(alan);
    }
    public void cevreHesapla(){
        double cevre=2*3.14*yarıcap;
        System.out.println(cevre);
    }

}
