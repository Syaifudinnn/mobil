
package kelompok.mobil;

public class MobilClass {

    int harga;
    
    void electric (){
        System.out.println("========== Mobil Electric ==========");
    }
    
    void SUV (){
        System.out.println("========== Mobil SUV ==========");
    }    
    
    void harga (int hargaNormal){
        this.harga = hargaNormal;
        System.out.println("Harga\t\t\t : " +harga);
    }
    
}
