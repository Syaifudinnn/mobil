
package kelompok.mobil;

public class Electric extends MobilClass{
    
    private String nama;
    int harga;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public void kelebihan(){
        System.out.println("Kelebihan\t\t : Lebih hemat, ramah lingkungan, suara mesin tidak berisik");
    }
    
    public void kekurangan(){
        System.out.println("Kekurangan\t\t : Jarak tempuh terbatas, stasiun pengisian baterai masih terbatas");
    }
    
    public void BB(){
        System.out.println("Bahan Bakar\t\t : Listrik");
    }
    
    void harga (int harga){
        super.harga = harga;
        System.out.println("Harga : " +super.harga);
    }
    
    void harga (int harga, int bulan){
        super.harga = harga / bulan;
        System.out.println("Harga Angsuran 60 bulan\t : " +super.harga);
    }
    
    public void cetak(){
        super.electric();
        System.out.println("");
        System.out.println("Contoh mobil\t\t : " +getNama());
    }
    
}
