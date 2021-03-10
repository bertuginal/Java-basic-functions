package kuyruk.uygulama;
class eleman {
    int icerik;
    public eleman(int icerik) {
        this.icerik = icerik;
    }
}

class kuyruk {

    eleman[] dizi;
    int bas, son; // Kuyruğun başı ve sonu
    int N; // Kuyruktaki eleman sayısı

    public kuyruk(int N) {
        dizi = new eleman[N];
        this.N = N;
        bas = 0;
        son = 0;
    }

    boolean dolumu() {
        return bas == (son + 1) % N; // baş, sondan hemen sonraki eleman başı gösteriyosa kuyruk doludur.
    }

    boolean bosmu() {
        return bas == son; //eşit ise boştur.
    }

    void ekle(eleman e) {
        if (!dolumu()) {
            dizi[son] = e;
            son = (son + 1) % N; // Dizi taşmasın diye N e bölünür.
        }
    }

    eleman sil() {
        eleman sonuc;
        if (!bosmu()) {
            sonuc = dizi[bas];
            bas = (bas + 1) % N;
            return sonuc;
        }
        return null;
    }
}
public class KuyrukUygulama {
    public static void main(String[] args) {
         kuyruk k = new kuyruk(10);
        k.ekle(new eleman(5));
        k.ekle(new eleman(20));
        k.ekle(new eleman(13));
        while(!k.bosmu()){
            eleman s=k.sil();
            System.out.println(s.icerik);
        }
    }
    
}
