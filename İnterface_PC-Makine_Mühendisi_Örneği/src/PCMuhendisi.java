
public class PCMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean adli_sicil;

    public PCMuhendisi(boolean askerlik, boolean adli_sicil) {
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

        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım;");

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);

        }
    }

}
