
public class Main {

    public static void main(String[] args) {

        //IMuhendis muhendis1 = new IMuhendis(); İnterfacelerden obje oluşturulamaz. Sadece interfacein onu implements eden classların objelerine referans olur.
        //IMuhendis muhendis1 = new PCMuhendisi(false, false); Bu kullanımda doğrudur.
        System.out.println("******************************************");
        System.out.println("PC Mühendisi : Bertuğ İnal");
        
        PCMuhendisi muhendis1 = new PCMuhendisi(false, false);
        String[] pctecrube = {"Vestel", "Havelsan", "Turksat"};
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalaması(3.67));
        muhendis1.is_tecrubesi(pctecrube);
        
        System.out.println("******************************************");
        System.out.println("Makine Mühendisi : Hasan Topal");
        //IMuhendis muhendis2 = new MakineMuhendisi(true,false); referans_getir de sıkıntı çıkarır. Çünkü interface içinde referans_getir yok. Çözümü için ya alttaki gibi yapılır ya da referans_getir in başına (MakineMuhendisi) yazılır.
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        String[] mmtecrube = {};
        String [] referans = {"Mehmet Topal","Ahmet Topal"};
        
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalaması(2.98));
        muhendis2.is_tecrubesi(mmtecrube);
        muhendis2.referans_getir(referans);
        //muhendis2.calıs();
        
    }

}
