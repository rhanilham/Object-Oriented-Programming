package Tugas4;
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public void kode(String value){
        kode = value;
    }
    
    public void namaBarang(String value){
        namaBarang = value;
    }
    
    public void hargaDasar(int value){
        hargaDasar = value;
    }
    
    public void diskon(float value){
        diskon = value;
    }
    
    public int hitungHargaJual(int hargaDasar, float diskon){
        int hargaJual = (int) (hargaDasar - ((hargaDasar/100)*diskon));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
    }   
}
