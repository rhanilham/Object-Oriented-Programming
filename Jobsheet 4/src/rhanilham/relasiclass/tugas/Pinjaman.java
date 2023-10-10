package rhanilham.relasiclass.tugas;
import java.util.Date;
public class Pinjaman {
    private Buku buku;
    private Anggota anggota;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Pinjaman(Buku buku, Anggota anggota, Date tanggalPinjam, Date tanggalKembali) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String getInfo() {
    String info = "Buku yang dipinjam:\n" + buku.getInfo() +
           "\nAnggota yang meminjam:\n" + anggota.getInfo() +
           "\nTanggal Pinjam: " + tanggalPinjam + "\nTanggal Kembali: " + tanggalKembali;
    return "\n" + info + "\n=====================================";
    }
}