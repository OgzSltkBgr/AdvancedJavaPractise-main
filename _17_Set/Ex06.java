package _17_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        //soru1--->
        HashSet<Integer> hashSet1=new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            hashSet1.add(1+(int) (Math.random() * (20-1)));//+1 ile sıfır uretmesının önune gecıldı. task 1-20 arası dediği için
        }
        System.out.println(hashSet1);

        //soru2-->

        arrayeDonustur(hashSet1);

    }

    private static void arrayeDonustur(HashSet<Integer> hashSet1) {
        int arr[]=new int[hashSet1.size()];
        int indeks=0;
        for (int w:hashSet1
             ) {
            arr[indeks]=w;
            indeks++;
        }
        System.out.println("Array-->"+ Arrays.toString(arr));
    }
}
