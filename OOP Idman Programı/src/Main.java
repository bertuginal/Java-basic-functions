
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.println("***İdman Programına Hoşgeldiniz***");
        String idmanlar = "**Geçerli Hareketler**\n"
                + "Burpee\n"
                + "Pushup(Şınav)\n"
                + "Situp(Mekik)\n"
                + "Squat";
        
        
System.out.println("******************************");
        System.out.println(idmanlar);
        System.out.println("******************************");

        System.out.println("**Bir idman oluşturun**");

        System.out.print("Burpee Sayısı : ");
        int burpee = k.nextInt();

        System.out.print("Pushup Sayısı : ");
        int pushup = k.nextInt();

        System.out.print("Situp Sayısı : ");
        int situp = k.nextInt();

        System.out.print("Squat Sayısı : ");
        int squat = k.nextInt();
        
        k.nextLine(); // \n 'yi işlem olarak görmesin diye biz bunu güvence altına alıyoruz ki hata ile karşılaşmayalım.(Bela Hata)

        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız başlıyor...");
        
        while(idman.IdmanBittiMi() == false){
            
            System.out.print("Hareket türü(burpee,pushup,situp,squat) = ");
            String tur = k.nextLine();
            System.out.print("Bu hareketten kaç adet yapacaksınız? = ");
           int sayi=k.nextInt();
           k.nextLine();
           idman.hareketYap(tur, sayi);
            
        }
        System.out.println("İdmanını başarıyla bitirdin. **Tebrikler**");

    }

}
