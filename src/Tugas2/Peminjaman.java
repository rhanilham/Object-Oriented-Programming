package Tugas2;
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public void dataPinjam(){
        System.out.println("ID: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga: " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
    }
    
    public int hargaBayar(int harga, int lamaSewa){
        int hargaBayar = harga * lamaSewa;
        return hargaBayar;
    }
}
