package Soal5;
public class Main {
    public static void main(String[] args) {
        Penulis penulis = new Penulis();
        penulis.setNama("John Doe");
        penulis.setAlamat("Jl. Penulis No. 123");

        Buku buku = new Buku();
        buku.setISBN("123456789");
        buku.setJudul("Java Programming");
        buku.setHarga(50);
        buku.setPenulis(penulis);

        System.out.println("ISBN: " + buku.getISBN());
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Harga: " + buku.getHarga());
        System.out.println("Penulis: " + buku.getPenulis().getNama());
        System.out.println("Alamat Penulis: " + buku.getPenulis().getAlamat());
    }
}
