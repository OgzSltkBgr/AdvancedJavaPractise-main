package P03_UcusProjesıi;

public class Yolcu {

    String name;
    String surName;
    int age;
    String city;
    int flyType;
    double bagajAgırlıgı;
    double price = 1.0;

    @Override
    public String toString() {
        return "Yolcu{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", flyType=" + flyType +
                ", bagajAgırlıgı=" + bagajAgırlıgı +
                ", price=" + price +
                '}';
    }

    public Yolcu(String name, String surName, int age, String city, int flyType, double bagajAgırlıgı) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
        this.flyType = flyType;
        this.bagajAgırlıgı = bagajAgırlıgı;
    }

    public void biletSatınAl() {
        double priceB = 0.10 * 500;
        double priceC = 0.10 * 700;
        double priceD = 0.10 * 900;

        switch (city) {
            case "B":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceB * forFlyTypePrice(flyType) + forLuggagePrice(bagajAgırlıgı))+"$");

                break;
            case "C":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceC *forFlyTypePrice(flyType)  + forLuggagePrice(bagajAgırlıgı))+"$");
                break;
            case "D":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceD * forFlyTypePrice(flyType) + forLuggagePrice(bagajAgırlıgı))+"$");
                break;


        }
    }

    public double forFlyTypePrice(int flyType) {
        if (flyType == 1) {
            price*=1.0;

        } else if (flyType == 2) {
            price =(price*0.8)*2;
        }
        return price;
    }

    public double forLuggagePrice(double bagajAgırlıgı) {
        double fazlaOdenecekMıktar = 0.0;
        if (bagajAgırlıgı > 25.0) {
            fazlaOdenecekMıktar = (bagajAgırlıgı - 25) * 3;
        }
        return fazlaOdenecekMıktar;
    }

    public double forAgePrice(double price) {

        if (age > 65) {
            price *= 0.7;
        } else if (age >= 12 && age < 24) {
            price *= 0.9;
        } else if (age < 12) {
            price *= 0.5;

        } else if (age >= 24 && age <= 65) {
            price *= 1.0;
        }
        return price;
    }


}
