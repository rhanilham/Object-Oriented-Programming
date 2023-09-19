package Tugas4;
import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode: ");
        String kode = sc.next();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = sc.next();
        System.out.print("Masukkan Harga Barang: ");
        int hargaBarang = sc.nextInt();
        System.out.print("Masukkan Diskon (dalam %): ");
        float diskon = sc.nextFloat();
        System.out.println("=========================");
        Barang brg = new Barang();
        brg.kode(kode);
        brg.namaBarang(namaBarang);
        brg.hargaDasar(hargaBarang);
        brg.diskon(diskon);
        brg.tampilData();
        System.out.println("Harga Jual: " + brg.hitungHargaJual(hargaBarang, diskon));
    }
}
