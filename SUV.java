
package kelompok.mobil;

public class SUV extends MobilClass{
    
    private String nama;
    int harga;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public void kelebihan(){
        System.out.println("Kelebihan\t\t : Tenaga mesin yang cukup besar, kabin yang lapang, "
                + "tampilan yang sporty dan stylist serta ground clearance yang tinggi");
    }
    
    public void kekurangan(){
        System.out.println("Kekurangan\t\t : Busa kursi dibuat tipis sehingga keras");
    }
    
    public void BB(){
        System.out.println("Bahan Bakar\t\t : Bensin");
    }
    
    void harga (int harga, int bulan){
        super.harga = harga / bulan;
        System.out.println("Harga Angsuran 60 bulan\t : " +super.harga);
    }
    
    void cetak (){
        super.SUV();
        System.out.println("");
        System.out.println("Contoh mobil\t\t : " +getNama());
    }
    
}
