package Tugas2;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();

        System.out.print("Masukkan Nama Anggota: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Limit Pinjaman: Rp");
        double limitPinjaman = scanner.nextDouble();

        Anggota donny = new Anggota(nik, nama, limitPinjaman);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: Rp" + donny.getLimitPinjaman());

        System.out.print("\nMeminjam uang (nominal): Rp");
        double jumlahPinjaman = scanner.nextDouble();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: Rp" + donny.getJumlahPinjaman());

        System.out.print("\nMembayar angsuran (nominal): Rp");
        double jumlahAngsuran = scanner.nextDouble();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: Rp" + donny.getJumlahPinjaman());     
    }
}
