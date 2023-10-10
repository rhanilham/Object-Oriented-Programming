package rhanilham.relasiclass.tugas;
import java.util.Date;
public class MainTugas {
public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan XYZ");

        Buku buku1 = new Buku("978-3-16-148410-0", "Harry Potter", "J.K. Rowling", 2000);
        Buku buku2 = new Buku("978-3-16-148410-1", "The Hobbit", "J.R.R. Tolkien", 1937);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Anggota anggota1 = new Anggota("A001", "John Doe", "Jl. ABC No. 123");
        Anggota anggota2 = new Anggota("A002", "Jane Smith", "Jl. XYZ No. 456");

        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        Date tanggalPinjam = new Date();
        Date tanggalKembali = new Date(tanggalPinjam.getTime() + (7 * 24 * 60 * 60 * 1000)); // Tambah 7 hari dari tanggal pinjam

        anggota1.pinjamBuku(buku1, tanggalPinjam, tanggalKembali);
        anggota2.pinjamBuku(buku2, tanggalPinjam, tanggalKembali);

        for (Anggota anggota : perpustakaan.getDaftarAnggota()) {
            System.out.println("Info Anggota:");
            System.out.println(anggota.getInfo());

            System.out.println("Buku yang Dipinjam:");
            for (Pinjaman pinjaman : anggota.getDaftarPinjaman()) {
                System.out.println(pinjaman.getInfo());
            }
        }
    }
}
