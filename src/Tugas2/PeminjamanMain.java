package Tugas2;
public class PeminjamanMain {
    public static void main(String[] args){
        Peminjaman pjm1 = new Peminjaman();
        pjm1.id = 101;
        pjm1.namaMember = "Rhanilham";
        pjm1.namaGame = "Basara 2 Heroes";
        pjm1.harga = 20000;
        pjm1.lamaSewa = 3;
        pjm1.dataPinjam();
        System.out.println("Harga yang harus dibayar adalah: " + pjm1.hargaBayar(pjm1.harga, pjm1.lamaSewa));
    }
}
