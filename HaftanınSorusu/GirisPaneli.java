package HaftanınSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
  static   Scanner scan = new Scanner(System.in);


   static Kayıt yeniKayıt = new Kayıt();//obje oluşturduk.method call yapılacak
   static List<User> kisi = new ArrayList<>();

    public static void girisPaneli() {

        System.out.println("Lütfen işleminizi seçiniz :");
        System.out.println(" 1-Kayıt Al\n2-Şanslı Kişiyi Bul\n3-Kullanıcı Listele\n4-Çıkış");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                kisi = yeniKayıt.kayıtAl();
                girisPaneli();
                break;
            case 2:
                yeniKayıt.sanslıKullanıcı(kisi);
                girisPaneli();
                break;
            case 3:
                yeniKayıt.listele(kisi);
                girisPaneli();
                break;
            case 4:
                System.out.println("yine bekleriz. şanslı günler dileriz");
                break;
            default:
                System.out.println("Hatalı işlem gırdınız");
                girisPaneli();

        }
    }
}

