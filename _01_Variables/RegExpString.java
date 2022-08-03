package _01_Variables;

public class RegExpString {
    public static void main(String[] args) {

        // str.matches(pattern);
        // str'nin pattern'a uygun olup olmadigini kontrol eder. sonuc boolean döner

        // . (nokta) yalniz tek karakter demektir
        // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali

        System.out.println(". quantifier ....");
        System.out.println("as".matches(".s"));  // true, ilk karakter a ikincisi 2 toplam 2 karakter
    }
}
