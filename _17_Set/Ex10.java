package _17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex10 {
    public static void main(String[] args) {
        // Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden
        // olusan bir liste haline getiren bir program yaziniz.

        int arr[] = {1, 2, 3, 4, 4, 5, 7, 3, 4};
        int tekrarsızArray[] = tekrarlarıSil(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tekrarsızArray));
    }

    private static int[] tekrarlarıSil(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        for (int w : arr
        ) {
            set1.add(w);
        }
        int tekrarsızArray[]=new int[set1.size()];
        int indeks=0;
        for (int w:set1
             ) {
            tekrarsızArray[indeks]=w;
            indeks++;
        }
        return tekrarsızArray;
    }
}
