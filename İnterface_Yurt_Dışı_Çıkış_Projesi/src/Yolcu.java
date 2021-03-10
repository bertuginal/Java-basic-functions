package YurtDışıÇıkışÖrneği;

import java.util.Scanner;

public class Yolcu implements YurtDısıKurallari {

    private int harc;
    private boolean siyasi_yasak;
    private boolean vize_durumu;

    public Yolcu() {
        Scanner k = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli = ");
        this.harc = k.nextInt();
        k.nextLine();

        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu?");
        System.out.println("'evet' veya 'hayır' yazınız.");
        String cevap = k.nextLine();

        if (cevap.equals("evet")) {
            this.siyasi_yasak = true;
        } else {
            this.siyasi_yasak = false;
        }

        System.out.println("Vizeniz bulunuyor mu?");
        System.out.println("'evet' veya 'hayır' yazınız.");
        String cevap2 = k.nextLine();

        if (cevap2.equals("evet")) {
            this.vize_durumu = true;
        } else {
            this.vize_durumu = false;
        }
    }

    @Override
    public boolean yurtdısı_harci_kontrol() {
        if (this.harc < 15 || this.harc > 15) {
            System.out.println("**Lütfen çıkış harcınızı tam olarak yatırınız**");
            return false;
        } else {
            System.out.println("**Yurt dışı harcı işlemi tamam**");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        if (this.siyasi_yasak == true) {
            System.out.println("**Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız.**");
            return false;
        } else {
            System.out.println("**Siyasi yasağınız bulunmuyor**");
            return true;
        }
    }

    @Override
    public boolean vize_durumu_kontrol() {
        if (this.vize_durumu == true) {
            System.out.println("**Vize işlemleri tamam**");
            return true;

        } else {
            System.out.println("**Vizeniz gideceğiniz ülkeye bulunmamaktadır**");
            return false;
        }
    }
}
