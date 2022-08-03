package P04_OkulYönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class İslemler {
   public static ArrayList<Kisiler> ögrenciListesi = new ArrayList<>();
   public static ArrayList<Kisiler> ögretmenListesi = new ArrayList<>();
   public static Scanner scan = new Scanner(System.in);
   public static String kisiTürü;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTürü = "ÖGRENCİ";
                islemMenüsü();
                break;
            case "2":
                kisiTürü = "ÖGRETMEN";
                islemMenüsü();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
                girisPaneli();//reqursive method call
                break;
        }


    }

    public static void cıkıs() {
        System.out.println("Yine bekleriz");
    }

    public static void islemMenüsü() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTürü + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenİslem = scan.nextInt();
        switch (secilenİslem) {
            case 1:
                ekle();
                islemMenüsü();
                break;
            case 2:
                arama();
                islemMenüsü();
                break;
            case 3:
                listele();
                islemMenüsü();
                break;
            case 4:
                silme();
                islemMenüsü();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                islemMenüsü();
                break;


        }
    }

    private static void silme() {
        System.out.println("lütfen silmek istediğiniz "+kisiTürü+" in tc kimlik numarasını giriniz");
        String kmlkNo=scan.next();
        boolean varMı=false;
        for (int i = 0; i <ögrenciListesi.size() ; i++) {
            if (kisiTürü.equals("ÖGRENCİ")){
                if (ögrenciListesi.get(i).getKimlikNo().equals(kmlkNo)){
                    ögrenciListesi.remove(i);
                    System.out.println("Silme işleminiz başarıyla gerçekleştirilmiştir");
                    varMı=true;
                    break;
                }
            } else if (kisiTürü.equals("ÖGRETMEN")){
                if (ögretmenListesi.get(i).getKimlikNo().equals(kmlkNo)){
                    ögretmenListesi.remove(i);
                    System.out.println("silme işleminiz gerçekleşmiştir");
                    varMı=true;
                }
            }
        }
        if (varMı==false){
            System.out.println("Bu "+kisiTürü+" listede mevcut değildir");
        }

    }

    private static void listele() {

        if (kisiTürü=="ÖGRENCİ"){
            System.out.println("öğrenci listesi--> " + ögrenciListesi);
        } else{
            System.out.println("Öğretmen listesi--> "+ögretmenListesi);
        }

    }

    private static void arama() {
        System.out.println("lütfen aramak istediğiniz "+kisiTürü+" in tc kimlik numarasını giriniz");
        String kmlkNo=scan.next();
        scan.next();

        boolean varMı=false;
        for (int i = 0; i <ögrenciListesi.size() ; i++) {
            if (kisiTürü.equals("ÖGRENCİ")){
                if (kmlkNo.equalsIgnoreCase(ögrenciListesi.get(i).getKimlikNo())){
                    System.out.println("Aradığınız öğrenci -->"+ögrenciListesi.get(i));
                    varMı=true;
                    break;
                }
            } else {
                if (kmlkNo.equalsIgnoreCase(ögretmenListesi.get(i).getKimlikNo())){
                    System.out.println("Aradığınız öğretmen-->"+ögretmenListesi.get(i));
                    varMı=true;
                }
            }
        }
        if (!varMı){
            System.out.println("Aradığınız "+kisiTürü+" listede mevcut değildir");
        }

    }


    private static void ekle() {
        System.out.print("***  " + kisiTürü + " ekleme sayfası  *** \n");
        System.out.print("Ad Soyad giriniz");
        scan.nextLine();//DUMMY YANİ HAYALET KOMUT
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik no giriniz");
        String kimlikNo = scan.nextLine();
        System.out.print("Yaş giriniz");
        int yas = scan.nextInt();

        if (kisiTürü.equals("ÖGRENCİ")) {
            System.out.print("Ögrenci no giriniz");
            scan.nextLine();
            String ögrenciNo = scan.next();
            System.out.print("sınıf giriniz");
            String sınıf = scan.next();
            Ögrenci sefilÖgrenci = new Ögrenci(adSoyad, kimlikNo, yas, ögrenciNo, sınıf);//p'li cons dan ögrnci obje create edıldi
            ögrenciListesi.add(sefilÖgrenci);
        } else {
            System.out.print("Sicil no giriniz");
            String sicilNo = scan.next();
            scan.nextLine();
            System.out.print("bölüm giriniz");
            String bölüm = scan.nextLine();
            Ögretmen ögretmen = new Ögretmen(adSoyad, kimlikNo, yas, bölüm, sicilNo);
            ögretmenListesi.add(ögretmen);

        }
        System.out.println("ekleme işleminiz başarıyla gerçekleştirilmiştir");


    }
}
