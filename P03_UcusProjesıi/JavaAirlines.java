package P03_UcusProjesıi;

import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);

        System.out.print("JavaAirlines Hoşgeldiniz\nB C D rotasından birini seçiniz :");
        String city=scan.next().toUpperCase();

        System.out.print("Uçuşunuz için\n tek yön--->1 \nçift yönde--->2\n giriniz");
        int flyType=scan.nextInt();

        System.out.print("lütfen yaşınızı giriniz :");
        int age =scan.nextInt();

        double priceB=0.10*500;
        double priceC=0.10*700;
        double priceD=0.10*900;

        if (city.equals("B") || city.equals("C") || city.equals("D") ){
            if (age>65){ //yas kontrolu yapıldı.bu yas aralığı için %30 indirim
                if (city.equals("B")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.7)+"$");

                    } else if (flyType==2){ //gidiş dönüş indirimi %20
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.7*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("C")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.7)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.7*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("D")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.7)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.7*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                }

            } else if (age>=12 && age<24){
                if (city.equals("B")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.9)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.9*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("C")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.9)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.9*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("D")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.9)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.9*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                }



            } else if (age<12){
                if (city.equals("B")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.5)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceB*0.5*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("C")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.5)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceC*0.5*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("D")){
                    if (flyType==1){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.5)+"$");

                    } else if (flyType==2){
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :"+(priceD*0.5*0.8)*2+"$");

                    } else{
                        System.out.println("hatalı veri girdiniz");
                    }

                }} else if (age>=24 && age<=65) {
                if (city.equals("B")) {
                    if (flyType == 1) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceB) + "$");

                    } else if (flyType == 2) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceB * 0.8) * 2 + "$");

                    } else {
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("C")) {
                    if (flyType == 1) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceC) + "$");

                    } else if (flyType == 2) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceC * 0.8) * 2 + "$");

                    } else {
                        System.out.println("hatalı veri girdiniz");
                    }
                } else if (city.equals("D")) {
                    if (flyType == 1) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceD) + "$");

                    } else if (flyType == 2) {
                        System.out.println("   *******   ");
                        System.out.println("uçuşunuz için bilet tutarınız :" + (priceD * 0.8) * 2 + "$");

                    } else {
                        System.out.println("hatalı veri girdiniz");
                    }
                } else {
                    System.out.println("verilen yönde rotamız yoktur");
                }


            }}}
}
