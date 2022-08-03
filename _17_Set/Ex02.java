package _17_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex02 {
    public static void main(String[] args) {
         /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
Colections.sort(arr1)
     */

        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        //1.adım arraylerı oluşturan method create edıldı
        arrList1 = arrListHazırla(10, 0, 20);
        arrList2 = arrListHazırla(5, 0, 20);
        System.out.println(arrList1);
        System.out.println(arrList2);

        //2.adım arraylerın ortak elemanları bulunuz
        // arrList1.retainAll(arrList2);//arrList1 de arrList2 ye aıt elemanlar ıdısndakı elemanları sıler ve
        // ıkı lıstı eşitler.yanı ortak elemanlar kalır,YORUMA ALDIK 3.ADIM İÇİN
        //  System.out.println("ortak elemanlı List-->"+arrList1);

        //3.adım bu iki listin farklı olan elemanlarını bulunuz

        ArrayList<Integer> arrayFark1 = new ArrayList<>(arrList1);//list1 de olup list2 de olmayanlar-->(list1-list2)
        ArrayList<Integer> arrayFark2 = new ArrayList<>(arrList2);//list2 de olpr list1 de olmayanlar -->(list2-list1)

        arrayFark1.removeAll(arrList2);//list2 dekı ortak elemanları sildi .gerıye farkları kaldı
        System.out.println("list1 farkı-->" + arrayFark1);

        arrayFark2.removeAll(arrList1);
        System.out.println("list2 farkı-->" + arrayFark2);

        //4.adım
        arrayFark1.addAll(arrayFark2);
        Collections.sort(arrayFark1);//k->b
        Collections.reverse(arrayFark1);//b->k

    }


    public static int getRandom(int min, int max) {

        return (int) (Math.random() * (max - min + 1));//max ıle mın arası sayı uretır
    }

    private static ArrayList<Integer> arrListHazırla(int size, int minDeger, int maxDeger) {//bu method create edılecek arrLıst sıze ı kadar min max arasında int sayı uretecek
        ArrayList<Integer> bosList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bosList.add(getRandom(minDeger, maxDeger));
        }
        return bosList;
    }
}
