package Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = scan.nextInt();

        PowerofTwo(num);

    }

    private static void PowerofTwo(int num) {
        int count = 0;
        int power = 1;
        while (power != num && power < num) {
            power *= 2;
            count++;
        }
        if (power == num) {

            System.out.println("Girdiginiz sayi 2'in  " + count + ". kuvveti");

        } else {
            System.out.println("lutfen ikinin kuvveti olan bir sayi giriniz ");

        }
    }
}
