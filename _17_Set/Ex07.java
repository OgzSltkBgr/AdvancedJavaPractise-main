package _17_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        /*  TASK :
         * main method altinda bir double hashSet olusturunuz.
         *
         * ve bu seti, adi setOlustur ve return tipi hashSet double olan
         *
         * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
         * kullanarak doldurun.
         *
         * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
         * edecek ayri bir method olusturarak
         *
         * hashSetin degerlerinin toplamini alacaksiniz.
         */

        HashSet<Double> hashSet1=new HashSet<>();

        hashSet1=SetOlustur(hashSet1);
        System.out.println(hashSet1);//[5.12, 3.23, 3.1, 23.12, 10.12]
        toplamınıAl(hashSet1);//44.69
    }

    private static void toplamınıAl(HashSet<Double> hashSet1) {
        double toplam=0;
        for (double w:hashSet1
             ) {
            toplam+=w;
        }
        System.out.println("hashset eleman toplamı -->"+toplam);
    }

    private static HashSet<Double> SetOlustur(HashSet<Double> hashSet1) {
        List<Double> list=new ArrayList<>(Arrays.asList(3.23 , 3.10 , 5.12 , 10.12 , 23.12));
        hashSet1.addAll(list);
        return hashSet1;
    }


}
