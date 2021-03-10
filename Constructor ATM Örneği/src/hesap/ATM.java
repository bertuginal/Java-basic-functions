package hesap;

import java.util.Scanner;

public class ATM {

    public void calıs(Hesap hesap) {
        Login login = new Login();
        Scanner k = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("BERT BANK HOŞGELDİNİZ");
        System.out.println("***************************");
        int giris_hakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("**Giriş başarılı**");
                break;
            } else {
                System.out.println("**Giriş başarısız**");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkınız = " + giris_hakki);
                if (giris_hakki == 0) {
                    System.out.println("**Giriş hakkınız bitti**");
                    return;

                }
            }
        }
        
        String islemler = "1) Bakiye görüntüle\n"
                + "2) Para Yatır\n"
                + "3) Para Çek\n"
                + "Çıkış için q ya basınız.";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        while (true) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
            String islem = k.nextLine();
            if (islem.equals("q")) {
                return; // Burada break; te kullanılabilir.Çünkü while döngüsünden sonra başka bir işlem olmadığı için direk sonlanacak.

            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz = " + hesap.getBakiye());

            } else if (islem.equals("2")) {
                System.out.print("Yatırmak istediğiniz tutar = ");
                int tutar = k.nextInt();
                k.nextLine();
                hesap.paraYatir(tutar);
                
            } else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutar = ");
                int tutar = k.nextInt();
                k.nextLine();
                hesap.paraCek(tutar);

            } else {
                System.out.println("**Geçersiz işlem**");
            }

        }

    }

}
