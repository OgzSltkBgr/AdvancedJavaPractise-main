package _01_Variables;

public class QQ3 {
    public static void main(String[] args) {
        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5


        int sayı=12345;

        int birler=sayı%10;//5
        int onlar=(sayı/10)%10;//4
        int yüzler=(sayı/100)%10;//3
        int binler=(sayı/1000)%10;//2
        int onBınler=(sayı/10000);//1

        // consolda alt satira yazdırmak için "\n"  komutu kullanılır.

        System.out.println(onBınler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);



    }
}
