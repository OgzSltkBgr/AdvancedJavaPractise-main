package P09_KitapYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class İslemler extends KitapBilgileri{
    static Scanner scan = new Scanner(System.in);//her method içinde kulannıcıdan verı alabılmek için
    // Scanner objesi create edıldı,static olarak!

    static List<KitapBilgileri> kitapListesi = new ArrayList<>();//kitapların atılacağı liste create edıldı

    public İslemler() {//p'siz constrctor create edıldı
    }

    public static void kitapEkle() {
        System.out.print("lütfen kitabın adını giriniz :");
        String isim = scan.nextLine();
        System.out.print("yazarını giriniz :");
        String yazar = scan.nextLine();
        System.out.print("Kitabın fiyat bilgisini giriniz");
        double fıyatBılgısı = scan.nextDouble();
        KitapBilgileri kitap = new KitapBilgileri(isim, yazar, fıyatBılgısı,kıtapNo);
        kitapListesi.add(kitap);
        System.out.println("Kitap ekleme işleminiz başarıyla gerçekleştirlmiştir");
        kitap.setKıtapNo(kitap.getKıtapNo());
    }

    public static void kitapSil() {
        System.out.println("lütfen silmek istediğiniz kıtabın ismini giriniz");
        String ad= scan.nextLine();
        KitapBilgileri ktb=new KitapBilgileri();
        if (ad.equalsIgnoreCase(ktb.getIsim())){
            kitapListesi.remove(ktb);
        } else{
            System.out.println("kıtap yok");
        }


    }

    public static void kitapArama() {

    }


}
