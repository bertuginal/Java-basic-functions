package YurtDışıÇıkışÖrneği;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("*******************************************");
        System.out.println("ADNAN MENDERES HAVALİMANI'NA HOŞGELDİNİZ");
        System.out.println("*******************************************");

        String sartlar = "**Yurt Dışı Çıkış Şartları**\n"
                + "1)15 TL harç bedelinizi tam olarak yatırmanız gerekiyor!\n"
                + "2)Herhangi bir siyasi yasağınızın bulunmaması gerek!\n"
                + "3)Gideceğiniz ülkeye vizenizin bulunması gerekiyor!";

        String mesaj = "***Yurt dışı şartlarından hepsini sağlamanız gerekiyor***";

        while (true) {
            
            System.out.println(sartlar);
            System.out.println("*******************************************");
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.yurtdısı_harci_kontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasi_yasak_kontrol() == false) {
                System.out.println(mesaj);
                continue;

            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.vize_durumu_kontrol() == false) {
                System.out.println(mesaj);
                continue;

            }
            System.out.println("İşlemleriniz tamam!\n"
                    + "Yurt dışına çıkabilirsiniz...");
            break;
        }

    }

}
