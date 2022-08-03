package P09_KitapYönetimi;

public class KitapBilgileri {
    private String isim;
    private String yazar;
    private double fıyatBılgısı;
    public static int kıtapNo = 1000;


    //kıtap için gereklı varıablelar tanımlandı. bu varıable'ları alan constroctor asagıda create edıldı.

    //kitap no default tanımlandı .
    //her kıtapEkle methodu çalıştıgında 1 artarak kıtaplara no'yu otomatık verebilecek.


    public KitapBilgileri() {//p'siz cons create edildi
    }

    public KitapBilgileri(String isim, String yazar, double fıyatBılgısı, int kıtapNo) {//p'li cons create edıldı
        this.isim = isim;
        this.yazar = yazar;
        this.fıyatBılgısı = fıyatBılgısı;
         setKıtapNo(kıtapNo);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public double getFıyatBılgısı() {
        return fıyatBılgısı;
    }

    public void setFıyatBılgısı(double fıyatBılgısı) {
        this.fıyatBılgısı = fıyatBılgısı;
    }

    public int getKıtapNo() {
        return kıtapNo;
    }

    public void setKıtapNo(int kıtapNo) {

       kıtapNo++;
       this.kıtapNo=kıtapNo;
    }

    @Override
    public String toString() {//toString methodu create edıldı.ancak body si manuel olarak değiştirildi.
        // istediğimiz yazım şekli ve yazdırmasını istediğimiz bilgiler içine eklendi.
        return "Kitabın adı='" + isim + '\'' +
                ", yazarı='" + yazar + '\'' +
                ", fiyat Bilgisi=" + fıyatBılgısı + ", kitap no=" + kıtapNo
                ;
    }
}
