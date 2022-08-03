package _17_Set;

import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn(dönüştüren) bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.

     */
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        elementEkle(hs,arr);

    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
        for (Integer sayi:arr) {
            hs.add(sayi);
        }
        yazdir(hs);
    }
    public  static  void  yazdir(HashSet<Integer> hs){
        for (Integer s:hs) {
            System.out.print(s+" ");
        }
    }
}
