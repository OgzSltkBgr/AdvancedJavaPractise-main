package HaftanınSorusu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class User {

    String name;
    LocalDateTime kayıtZamanı;

    public User() { }//p'siz cons.

    public User(String name, LocalDateTime kayıtZamanı) {//p'li cons.
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }
}
