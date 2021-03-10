
public class MakineMuhendisi implements IMuhendis,ICalısma { // Bir sınıf birden fazla implements edebilir.

    @Override
    public void calıs() {
        System.out.println("Makine Mühendisi çalışıyor.");
    }

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;

    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {
            System.out.println("Adli sicil kaydım var.");

        } else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] dizi) {
        if (dizi.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");

        } else {
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım;");
            for (int i = 0; i < dizi.length; i++) {
                System.out.println(dizi[i]);
            }
        }
    }

    public void referans_getir(String[] dizi) {
        if (dizi.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor.");

        } else {
            System.out.println("Referanslarım;");
            for (int i = 0; i < dizi.length; i++) {
                System.out.println(dizi[i]);
            }
        }
    }

}
