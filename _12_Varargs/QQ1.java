package _12_Varargs;

public class QQ1 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String str1 = "m";
        String str2 = "e";
        String str3 = "r";
        String str4 = "v";
        String str5 = "e";

        concat(str1, str2);//me
        concat(str1, str2, str3);//mer
        concat(str1, str2, str3, str4);//merv
        concat(str1, str2, str3, str4, str5);//merve


    }

    public static void concat(String... str) {
        String kelıme = "";

        for (String each : str
        ) {
            kelıme += each;

        }
        System.out.println(kelıme);
    }
}
