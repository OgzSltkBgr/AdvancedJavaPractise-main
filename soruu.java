import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.List;

public class soruu {
    public static void main(String[] args) {

        //Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
        //Input : 5
        //Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

        int sayı = 5;
        List<Integer> asalSayılar = new ArrayList<>();

        for (int i = (sayı + 1); i < 100; i++) {
            boolean sonuc = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sonuc = true;
                }
            }
            if (sonuc == false) {
                asalSayılar.add(i);

            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(asalSayılar.get(i) + "  ");
        }


    }
}





