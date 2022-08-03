package QQ1_Encapsulatıon;

public class Araba {//POJO : planing old java object-->modal class

    private String model;
    private String renk;
    private int motor;
    private int yıl;

    public Araba(int motor, int yıl) {//iki parametrelı cons oluşturuldu
        setYıl(yıl);
        setMotor(motor);
    }

    @Override
    public String toString() {//objelere ait değerleri direk yazdırmak için oluşturuldu

        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {//motor hacmi girişini hatalı grişlere karşı encapsüle ettik

        if (motor<1000){
            this.motor=motor+500;
        }else
        this.motor = motor;
    }

    public int getYıl() {

        return yıl;
    }

    public void setYıl(int yıl) {//yıl girişini hatalı girişe arşı encapsüle eettik

        if (yıl<0){
            this.yıl=(-1)*yıl;
        } else
            this.yıl=yıl;

    }

    public Araba() {
    }

    public Araba(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);//cons obc cretae etmek için parametre olarak giren motor datası
        // setMotor() methoduna parametre olarak çalıştı değerini aldı
        setYıl(yıl);
    }
}

