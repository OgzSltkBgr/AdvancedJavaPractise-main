package _16_LinkedList;

import javax.script.ScriptContext;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

			 */

        LinkedList<String> isimler = new LinkedList<>(Arrays.asList( "haluk" ,"ipek", "harun", "irem" ));
        System.out.println(isimler);//[haluk, ipek, harun, irem]

        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.nextLine().toLowerCase();

        if (isimler.remove(isim)){ //remove methodu true false döneceği için varsa ve sılerse if body çalışcak
            System.out.println("Listede bu isim vardı ve silindi ");
            System.out.println(isimler);
        } else {
            System.out.println("listede bu eleman yoktu ve silinemedi");
        }

    }
}
