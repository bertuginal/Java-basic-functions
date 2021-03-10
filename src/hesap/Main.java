package hesap;

public class Main {

    public static void main(String[] args) {
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap("gurol", "1234", 5000);
        
        atm.calıs(hesap);
        System.out.println("Sistemden çıkılıyor..");
    }
}
