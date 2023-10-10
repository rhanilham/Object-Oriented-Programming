package rhanilham.relasiclass.tugas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Anggota {
    private String id;
    private String nama;
    private String alamat;
    private List<Pinjaman> daftarPinjaman;

    public Anggota(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.daftarPinjaman = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void pinjamBuku(Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        Pinjaman pinjaman = new Pinjaman(buku, this, tanggalPinjam, tanggalKembali);
        daftarPinjaman.add(pinjaman);
    }

    public void kembalikanBuku(Pinjaman pinjaman) {
        daftarPinjaman.remove(pinjaman);
    }

    public List<Pinjaman> getDaftarPinjaman() {
        return daftarPinjaman;
    }

    public String getInfo() {
        return "ID Anggota: " + id + "\nNama: " + nama + "\nAlamat: " + alamat;
    }
}
