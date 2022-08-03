package P04_OkulYönetimi;

public class Ögretmen extends Kisiler{

   private String bolüm;
   private String sicilNo;

   public Ögretmen (){}

    public Ögretmen(String adSoyad, String kimlikNo, int yas, String bolüm, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolüm = bolüm;
        this.sicilNo = sicilNo;
    }

    public String getBolüm() {
        return bolüm;
    }

    public void setBolüm(String bolüm) {
        this.bolüm = bolüm;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "bolüm='" + bolüm + '\'' +
                ", sicilNo='" + sicilNo + '\''
                 ;
    }
}
