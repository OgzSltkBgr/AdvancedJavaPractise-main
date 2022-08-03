package P04_OkulYönetimi;

public class Ögrenci extends Kisiler {

    private String ögrenciNo;
    private String sınıf;

    public Ögrenci (){};//p'siz cons

    public Ögrenci(String adSoyad, String kimlikNo, int yas, String ögrenciNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ögrenciNo = ögrenciNo;
        this.sınıf = sınıf;
    }

    public String getÖgrenciNo() {
        return ögrenciNo;
    }

    public void setÖgrenciNo(String ögrenciNo) {
        this.ögrenciNo = ögrenciNo;
    }

    @Override
    public String toString() {
        return " " +super.toString()+
                "ögrenciNo='" + ögrenciNo + '\'' +
                ", sınıf='" + sınıf + '\''
                ;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }
}
