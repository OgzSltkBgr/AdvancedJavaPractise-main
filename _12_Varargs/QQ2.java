package _12_Varargs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QQ2 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int sayı1=2;
        int sayı2=3;
        int sayı3=5;
        topla(sayı1,sayı2,sayı3);

        int sayı4=7;
        topla(sayı1,sayı2,sayı3,sayı4);

    }

    public static void topla(int... toplanacakSayilar) {

       List <Integer> sayılar=new ArrayList<>();
       int toplam=0;
        for (Integer each:toplanacakSayilar
             ) {
            sayılar.add(each);
        }
        for (int i = 1; i <sayılar.size() ; i++) {
            toplam+=sayılar.get(i);
        }

        toplam*=sayılar.get(0);
        System.out.println(toplam);
    }
    }

