package P02_AtmProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static P02_AtmProjesi.Islemler.menu;
import static P02_AtmProjesi.JavaBankAtm.scan;


public class KullanıcıBılgılerı {
    String isim="";
    String soyisim="";
   static String kartNumara="7276534545678923";
  public static String sıfre="asgf";




    public static void girisMenusu(){
        System.out.println("***Java Bank ATM ye Hoşgeldiniz***");

       kartNoKontrol();
    }




    public static void kartNoKontrol() {
        System.out.println("Lütfen kart numaranızı giriniz :");
        String kartNo = scan.nextLine();

        if (kartNo.equals(kartNumara)){
            sıfreKontrol();
        } else{
            System.out.println("lütfen geçerli bir kart numarası gırınız");
            kartNoKontrol();
        }



    }

    public static void sıfreKontrol() {
        System.out.println("Lütfen şifrenizi giriniz");
       String sifre =scan.next();
        if (sifre.equals(sıfre)) {
            System.out.println("Şifreniz kabul edildi");
            menu();
        } else {
            System.out.println("Lütfen geçerli bir şifre giriniz");
            sıfreKontrol();
        }

    }





}
