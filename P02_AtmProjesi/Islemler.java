package P02_AtmProjesi;

import static P02_AtmProjesi.JavaBankAtm.scan;

public class Islemler {


   static double bakıye = 2000;


    public static void menu() {
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
        System.out.println("1.Bakıye Sorgulama\n 2.Para Yatırma\n 3.Para Çekme\n 4.Para Gönderme\n 5.Şifre Değiştirme\n6.Çıkış");

       islemler();

    }

    public static void  islemler() {
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Mevcut bakiyeniz :" + bakıye);
                menu();
                break;
            case 2:
                System.out.println("lütfen yatırmak istediğiniz mıktarı gırınız");
                double yatırılanPara = scan.nextDouble();
                bakıye += yatırılanPara;
                System.out.println("para yatırma işleminiz gerçekleşmiştir");
                System.out.println("Mevcut bakiyeniz :" + bakıye);
                menu();
                break;
            case 3:
                System.out.println("Lütfen çekmek istediğiniz miktarı giriniz");
                double cekılenMıktar = scan.nextDouble();
                if (cekılenMıktar <= bakıye) {
                    bakıye -= cekılenMıktar;
                    System.out.println("para çekme işleminiz gerçekleşmiştir");
                    System.out.println("Mevcut bakiyeniz :" + bakıye);
                    menu();
                    break;
                } else {
                    System.out.println("Para çekme işlemi için yeterli bakıyeniz yoktur");
                    menu();
                }
                break;
            case 4:
                paraGönderme();
                break;
            case 5:
                sıfreDegıstır();
            case 6:
                System.out.println("***Java Bankı tercih ettiğiniz için teşekkür ederiz***");
                System.out.println("***Hoşçakalın***");


        }
    }

    public static void sıfreDegıstır() {
        System.out.println("lütfen mevcut şifrenizi giriniz");
        String mevcutSıfre= scan.next();
        if (mevcutSıfre.equals(KullanıcıBılgılerı.sıfre)){
           yenıSıfreAl();
        } else{
            System.out.println("Hatalı giriş yaptınız");
            sıfreDegıstır();
        }
    }

   public static void yenıSıfreAl() {
       System.out.println("Lütfen yeni şifrenizi giriniz");
       String yenıSıfre=scan.next();
       if (yenıSıfre.length()==4){
           System.out.println("Şifreniz başarıyla değiştirilmiştir");
           System.out.println("Yeni şifreniz :"+yenıSıfre);
           menu();
       } else{
           System.out.println("Şifre 4 haneli olmalıdır");
           yenıSıfreAl();



       }
    }

    public static void paraGönderme() {
        System.out.println("Lütfen göndermek istediğiniz miktarı giriniz");
        double gönderılenMıktar = scan.nextDouble();
        System.out.println("Lütfen para göndereceğiniz iban numarasını giriniz");
        String ıban= scan.next();
        if (ıban.length()==26 && ıban.startsWith("TR")){
            if (gönderılenMıktar <= bakıye) {
                bakıye -= gönderılenMıktar;
                System.out.println("Para gönderme işleminiz gerçekleşmiştir");
                System.out.println("Mevcut bakiyeniz :" + bakıye);
                menu();
            } else {
                System.out.println("Para gönderme işlemi için yeterli bakıyeniz yoktur");
                menu();
            }
        } else{
            System.out.println("Hatalı ıban numarası gırdınız");
            menu();
        }



    }
}
