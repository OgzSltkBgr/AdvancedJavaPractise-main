package P07_GeometrikHesaplama;

public class Sekıl {
    int kısaKenar;
    int uzunKenar;
    int yarıcap;
public void cevreHesaplama(){
    System.out.println("her seklın cevre hesabı kendıne özgudur");
}
    public void alanHesapla(){
        System.out.println("her seklın alan hesabı kendıne ozgudur");
    }

    public Sekıl() {//parametresız cons create edıldı
    }


    public Sekıl(int kısaKenar, int uzunKenar) {//iki parametrelı constractor dıkdortgen ve kare için create edıldı
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Sekıl(int yarıcap) {//tek parametrelı constractor create edıldı.çember için
        this.yarıcap = yarıcap;
    }



}
