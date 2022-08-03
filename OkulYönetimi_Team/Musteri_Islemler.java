package OkulYönetimi_Team;

import java.util.Scanner;

public class Musteri_Islemler {
    static Scanner scan = new Scanner(System.in);

    public void musteriPaneli() {
        System.out.println("*** Java Kütüphanesine Hoşgeldiniz ***");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :" +
                "\n1-Kitap arama \n 2-Kitap satın alma\n 3-Sepete ekle\n 4-Ana menüye dön\n 5-Çıkış");

        int islem =scan.nextInt();

        switch (islem){
            case 1:
                kitapArama();
                musteriPaneli();
                break;
            case 2:
                kitapSatınAl();
                musteriPaneli();
                break;
            case 3:
                sepeteEkle();
                musteriPaneli();
                break;
            case 4:
                //anaMenü();-->bu method create edılınce aktıf olacak
                break;
            case 5:
                System.out.println("Hoşçakalın \n Yine Bekleriz");
                    break;
            default:
                System.out.println("Hatalı seçim yaptınız ");
                musteriPaneli();
        }

    }

    public void kitapArama() {

    }

    public void kitapSatınAl() {

    }

    public void sepeteEkle() {

    }


}
