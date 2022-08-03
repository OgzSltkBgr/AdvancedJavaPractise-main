package _12_Varargs;

public class Trick {
    public static void main(String[] args) {
        int[] arr = {17, 23,6,34 };
        System.out.println("array toplami : "+arrTopla(arr));
        System.out.println("varargs toplami :"+varargsTopla(23,6,34,17,35));
        System.out.println("varargs ın array parametreli toplami :"+varargsTopla(arr));
        //varargs array gibi davrandigi icin  herhangi bir arryi parametre olarak alabilir.
    }

    private static Integer varargsTopla(int... sayı) {
        int toplam=0;
        for (int each:sayı
             ) {
            toplam+=each;
        }
        return toplam;
    }

    public static Integer arrTopla(int[] arr) {

        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        return toplam;
    }
}
