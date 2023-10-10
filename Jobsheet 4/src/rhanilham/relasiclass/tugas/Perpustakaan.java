package rhanilham.relasiclass.tugas;
import java.util.ArrayList;
import java.util.List;
public class Perpustakaan {
    private String nama;
    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }

    public String getInfo() {
        return "Nama Perpustakaan: " + nama;
    }
}
