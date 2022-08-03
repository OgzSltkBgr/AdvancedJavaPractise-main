package Tasks;

import java.util.Scanner;

public class Task03_KelımeOyunu {
    //her metodda kullaancağım için aşağıdaki scan ve veriable'leri  classlevel'a aldım
    static int oyuncu = 1;//oyuncuyu önce 1 yani 1. oyuncu olarak başlangıç değeri ile atadım
    // sonra oyuncu değiştireceğim zaman oyuncu=1 yerine oyuncu=2 atayacağım
    static int puan1 = 0;
    static int puan2 = 0;
    static String kelime = "";
    static String ekleme = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
W         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        System.out.println(oyuncu + ". oyuncu lütfen bir kelıme giriniz");
        kelime = scan.next();

        oyuncuDegıstır();

        onayAl();


    }

    public static void onayAl() {
        System.out.println("Girilen kelime : " + kelime);//girilen ilk oyuna başlama kelimesini gösterdim
        System.out.println(oyuncu + ". oyuncu girilen kelimeyi kabul ediyor musun ? \n1: Evet \n0: Hayir");

        int kabul = scan.nextInt();
        if (kabul == 1) { //kelıme kabul edıyorsa
            if (oyuncu == 1) {
                puan2 += kelime.length();//keelımenın harf sayısı kadar puanı 2.oyuncuya ekledık
            } else {
                puan1 += kelime.length();//kelımenın harf sayısı kadar puanı 1. oyuncuya ekledık
            }

        } else oyunuBitir();


        oyunaDevamEdecekMi();


    }

    public static void oyunuBitir() {
        System.out.println("geçersiz kelıme giridiniz\n");
        System.out.println(oyuncu + ". oyuncu oyunu kazandı :)");
    }

    public static void oyunaDevamEdecekMi() {
        System.out.println("oyuna devametmek istıyor musunuz : \n1 :EVET \n2 :HAYIR");
        int kabul2 = scan.nextInt();
        if (kabul2 == 1) {
            kelımeEkle();
        } else {
            System.out.println("OYUN BİTTİ");
            System.out.println("1.oyuncunun puanı :" + puan1 + "\n2.oyuncunun puanı : " + puan2);
            if (puan1 > puan2) {
                System.out.println("oyunu 1. oyuncu kazanmıştır");
            } else if (puan2 > puan1) {
                System.out.println("oyunu 2.oyuncu kazanmıştır.");
            } else {
                System.out.println("oyun berabere bitmiştir.");
            }
        }
    }

    public static void kelımeEkle() {
        System.out.println("kelımeye eklemek ıstedıgınız kelımeyı gırınız");
        String ekleme = scan.next();
        System.out.println("kelımeyı başa(1) sona(2) mı  mı ekmele ıstersınız ");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            kelime = ekleme + kelime;
        } else {
            kelime = kelime + ekleme;
        }
        oyuncuDegıstır();
        onayAl();

    }

    public static int oyuncuDegıstır() {
        if (oyuncu == 1) {
            oyuncu = 2;
        } else {
            oyuncu = 1;
        }
        return oyuncu;
    }
}
