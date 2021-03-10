package hesap;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {

        Scanner k = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanıcı adı : ");
        kullanici_adi = k.nextLine();
        System.out.print("Parola : ");
        parola = k.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            
            return true;
            
        } else {
            
            return false;
        }

    }

}
