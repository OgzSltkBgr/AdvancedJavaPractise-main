package _17_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        /* TASK:
        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin
     */

        ArrayList<Integer> arr=new ArrayList<>();
        //1 ve 2. adım array oluşturuldu ve prınt edıldı
        arr=arrayeElemanEkle(30,0,10);
        System.out.println(arr);

        //3 ve 4. adım tekrarlar arrayden sılındır ve prınt edıldı
        arr=tekraralarıSil(arr);
        System.out.println(arr);

        //5.adım arrayLıstı set e cevır

        Set<Integer> set1=new HashSet<>(arr);
        System.out.println(set1);

        //6.adım set i arrayLıste cevır
        ArrayList<Integer> arrayList1=new ArrayList<>(set1);
        System.out.println(arrayList1);

    }

    public static ArrayList<Integer> tekraralarıSil(ArrayList<Integer> arr) {
        ArrayList<Integer> tekrarsızArrayList=new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            if (!tekrarsızArrayList.contains(arr.get(i))){
                tekrarsızArrayList.add(arr.get(i));
            }
        }
        return tekrarsızArrayList;

    }

    public static ArrayList<Integer> arrayeElemanEkle(int size, int min, int max) {
        ArrayList<Integer> bosList=new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            bosList.add((int) (Math.random() * (max-min+1)));
        }
        return bosList;
    }


}
