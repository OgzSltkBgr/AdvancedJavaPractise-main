package QQ1_Encapsulatıon;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda=new Araba();

        honda.setYıl(2018);
        honda.setRenk("beyaz");
        honda.setMotor(90);

        Araba toyota = new Araba("avensiss", "beyaz", 300, -2020);//p'li obj create edildi
        Araba volvo = new Araba("s80", "füme", 2400, 2010);//p'li obj create edildi


        System.out.println("toyota -->"+toyota);




    }
}
