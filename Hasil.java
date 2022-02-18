
package kelompok.mobil;

public class Hasil {
    
    public static void main(String[] args) {
        
        MobilClass mobil = new MobilClass();
        
        
        SUV suv = new SUV(); 
        suv.setNama("Honda BRV");
        suv.cetak();
        suv.BB();
        suv.kelebihan();
        suv.kekurangan();
        mobil.harga(292200000);
        suv.harga(292200000, 60);
        
        System.out.println("");
        
        Electric listrik = new Electric();
        listrik.setNama("Tesla model S Long Range");
        listrik.cetak();
        listrik.BB();
        listrik.kelebihan();
        listrik.kekurangan();
        listrik.harga(1000000000);
        listrik.harga(1000000000, 60);
        
        
    }
    
}
