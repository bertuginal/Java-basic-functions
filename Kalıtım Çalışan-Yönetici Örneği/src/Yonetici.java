
public class Yonetici extends Calisan { // Subclass (Alt sınıf)

    private int sorumlu_kisi; // Extra özellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) { // Miras alabilmek için bu sınıfa özgü constructor oluşturulmalı.
        super(isim, maas, departman); //private olduğu için başka sınıftan direk olarak erişilemez.Dolaylı yoldan erişebilmek için super metodu kullanılmalı. Super sınıfına erişim super metodu ile sağlandı.

        this.sorumlu_kisi = sorumlu_kisi;

    }
    
    public void zamYap(int zam_miktari){
        System.out.println("Çalışanlara " + zam_miktari + " TL zam yapıldı.");
    }
    public void bilgilerigoster(){
        /* System.out.println("İsim : " + getIsim());
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : " + getDepartman());*/
        super.bilgilerigoster();
        
        System.out.println("Sorumlu kişi sayısı : " + this.sorumlu_kisi);
        
    }

}
