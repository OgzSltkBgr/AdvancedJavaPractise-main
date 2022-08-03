package P09_KitapYönetimi;

import java.util.Scanner;

import static P09_KitapYönetimi.İslemler.*;

public class GirisPaneli {

    static Scanner scan = new Scanner(System.in);

    public static void girisPanelii() {
        System.out.println("*** java Kütüphanesine Hoşgeldiniz ***\n");
        islemler();
    }

    private static void islemler() {
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :\n1-Kitap ekle\n2-Kitap sil\n3-Kitap Listele\n4-Kitap arama\n5-Çıkış ");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                kitapEkle();
                islemler();
                break;
            case 2:
                kitapSil();
                islemler();
                break;
            case 3:
                System.out.println("Java kütüphanesindeki Kitap listesi :"+ kitapListesi);
                islemler();
                break;
            case 4:
                kitapArama();
                islemler();
                break;
            case 5:
                System.out.println("Tekrar bekleriz =) ");
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
                islemler();
        }
    }
}
