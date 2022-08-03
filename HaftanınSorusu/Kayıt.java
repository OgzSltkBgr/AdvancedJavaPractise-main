package HaftanınSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {
    List<User> kişiler=new ArrayList<>();//boş list create edıldı.katıtAl methodu bu lıste element ekleyecek

    public  List<User> kayıtAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı gırınız");
        String ısım= scan.nextLine();
        User k1=new User(ısım, LocalDateTime.now());//user classtan parametreli cons ile obje create edıldı
       kişiler.add(k1);//user classtan pli cons ıle create edılen obje kişiler listesine eklendı
        return kişiler;
    }

    public void sanslıKullanıcı(List<User> kll){
        for (User k:kll//kayıtAl methodunda create edılen her bır kullanıcı donguye sokuldu
             ) {
            if (k.kayıtZamanı.getSecond()<10){//her bır kullanıcının kayıtzamanındakı sanıyesı if sartına sokuldu
                System.out.println("Şanslı kişisiniz "+k.name+ " 5 kılo bal kazandınız :D");
            } else {
                System.out.println("maalesef şanslı kişi değilsiniz "+k.name);
            }

        }

    }
    public void listele(List<User> kullanıcılar){
        for (User k:kullanıcılar//kayıtAl methodundan kişiler listini dönguye sokuyor
             ) {

            System.out.println("Adı :"+k.name+" kayıt zamanı :"+k.kayıtZamanı);//listedekı her bır kullanıcının
                                                                               // ad ve soyadını yazdırdı

        }

    }
}
