package Tasks;

public class Permutasyon_Combinasyon {
     /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)
            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!
            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760
            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */

    public static void main(String[] args) {
        double x=15;
        double y=4;



double combınasyon=faktoriyelHesapla(x)/(faktoriyelHesapla(y)*(faktoriyelHesapla((x-y))));

        System.out.println("x ve y'nin combinasyonu =" +combınasyon);

double permutasyon=faktoriyelHesapla(x)/faktoriyelHesapla((x-y));

        System.out.println("x ve y nin permutasyonu ="+permutasyon);


    }

    public static double faktoriyelHesapla(double x) {
        int faktoriyel=1;
        for (long i = 1; i <=x ; i++) {
            faktoriyel*=i;
        }

     return faktoriyel;
    }
}
