package rhanilham.relasiclass.tugas;
public class Buku {
private String isbn;
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public Buku(String isbn, String judul, String penulis, int tahunTerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getInfo() {
        return "ISBN: " + isbn + "\nJudul: " + judul + "\nPenulis: " + penulis + "\nTahun Terbit: " + tahunTerbit;
    }
}
