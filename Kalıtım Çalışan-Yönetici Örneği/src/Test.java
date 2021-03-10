public class Test {
    // is-a ilişkisi vardır. Yönetici de bir çalışandır mantığı.
    public static void main(String[] args) {
        Yonetici yonetici1 = new Yonetici("Bertuğ İnal",2500,"IT",10);
        Calisan calisan1=new Calisan("Bert",555,"PC");
        
       //yonetici1.zamYap(1000);
       yonetici1.bilgilerigoster();
   
}
    
}
