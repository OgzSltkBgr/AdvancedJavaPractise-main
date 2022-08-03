package Tasks;

import java.util.Scanner;
import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String sentence = scan.nextLine();
        String theLongestWord = "";

        LongestWord(sentence, theLongestWord);

    }

    public static void LongestWord(String sentence, String theLongestWord) {
      int ındeksWord=0;
      int lenghtWord=0;
        String str[] = sentence.split(" ");

        for (int i = 0; i <str.length ; i++) {
           if (lenghtWord<str[i].length()){
               lenghtWord=str[i].length();
               ındeksWord=i;

           }

        }
        System.out.println(str[ındeksWord]);
    }

}



