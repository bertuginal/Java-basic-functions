
public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equals("burpee")) {

            burpeeYap(sayi);

        } else if (hareketTuru.equals("pushup")) {

            pushupYap(sayi);

        } else if (hareketTuru.equals("situp")) {

            situpYap(sayi);

        } else if (hareketTuru.equals("squat")) {

            squatYap(sayi);
        } else {
            System.out.println("**Geçersiz Hareket**");
        }

    }

    public void burpeeYap(int sayi) {

        if (burpee_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin. Diğer idmanları da tamamla...");
            burpee_sayisi = 0;
            System.out.println("Kalan burpee sayısı : " + burpee_sayisi);
        } else {
            burpee_sayisi -= sayi;
            if (burpee_sayisi == 0) {
                System.out.println("Yapacak burpee kalmadı...");
                System.out.println("Burpee idmanını tamamladın **Tebrikler** ");
            } else {
                System.out.println("Kalan burpee sayısı : " + burpee_sayisi);
                System.out.println(burpee_sayisi + " tane burpee daha yapmalısın!!");
            }
        }

    }

    public void pushupYap(int sayi) {
        
        if (pushup_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin. Diğer idmanları da tamamla...");
            pushup_sayisi = 0;
            System.out.println("Kalan pushup sayısı : " + pushup_sayisi);
        } else {
            pushup_sayisi -= sayi;
            if (pushup_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
            System.out.println("Pushup idmanını tamamladın **Tebrikler** Diğer idmanları da tamamla...");

        }else{
            System.out.println("Kalan pushup sayısı : " + pushup_sayisi);
            System.out.println(pushup_sayisi + " tane daha pushup yapmalısın!!");
        }
        }
    }

    public void situpYap(int sayi) {
       
        if (situp_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin. Diğer idmanları da tamamla...");
            situp_sayisi = 0;
            System.out.println("Kalan situp sayısı : " + situp_sayisi);
        } else {
            situp_sayisi -= sayi;
             if (situp_sayisi == 0) {
            System.out.println("Yapacak situp kalmadı...");
            System.out.println("Situp idmanını tamamladın **Tebrikler** Diğer idmanları da tamamla...");

        }else{
            System.out.println("Kalan situp sayısı : " + situp_sayisi);
            System.out.println(situp_sayisi + "tane daha situp yapmalısın!!");
        }
        }
    }

    public void squatYap(int sayi) {
        
        if (squat_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin. Diğer idmanları da tamamla...");
            squat_sayisi = 0;
            System.out.println("Kalan squat sayısı : " + squat_sayisi);
        } else {
            squat_sayisi -= sayi;
            if (squat_sayisi == 0) {
            System.out.println("Yapacak squat kalmadı...");
            System.out.println("Squat idmanını tamamladın **Tebrikler** Diğer idmanları da tamamla...");

        }else{
            System.out.println("Kalan squat sayısı : " + squat_sayisi);
            System.out.println(squat_sayisi + "tane daha squat yapmalısın!!");
        }
        }

    }

    public boolean IdmanBittiMi() {
        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
        //Hepsi 0 ise true değer dönecek. Eğer 1 tanesi bile yanlışsa false değer dönecek.
    }

}
