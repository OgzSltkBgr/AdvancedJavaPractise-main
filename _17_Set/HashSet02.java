package _17_Set;

import java.util.*;

public class HashSet02 {
    public static void main(String[] args) {
        /*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}
    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */

        //1.adımda arrayı arrayliste dönuşturduk
        String arr[]={"reha", "hakan", "haluk", "ipek", "ahsen"};
        System.out.println("array-->"+ Arrays.toString(arr));
        ArrayList<String> arrayLıst=new ArrayList<>();
        arrayLıst=arrayListeDonustur(arr);
        System.out.println("arrayList-->" +arrayLıst);

        //2.adımda arraylistin elemanları ıle hashset doldurduk
        HashSet<String> set1=new HashSet<>();
        set1.addAll(arrayLıst);
        System.out.println("hashSet-->"+set1);

        //3.adımda arraylıstın elemanları ıle TreeSet doldurduk
        TreeSet<String> set2=new TreeSet<>();
        set2.addAll(arrayLıst);
        System.out.println("TreeSet-->"+set2);

        //4.adımda arraylıstın elemanları ıle linkedHashSet doldurduk
        LinkedHashSet<String> set3=new LinkedHashSet<>();
        set3.addAll(arrayLıst);
        System.out.println("linkedHashSet--->"+set3);




    }

    private static ArrayList<String> arrayListeDonustur(String[] arr) {
        ArrayList<String> arrayList1=new ArrayList<>();
        for (String w:arr
             ) {
            arrayList1.add(w);
        }
        return arrayList1;
    }
}
