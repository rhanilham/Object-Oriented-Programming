package inheritance.soal;
public class Main {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 4);
        Lingkaran lingkaran = new Lingkaran(3);
        Segitiga segitiga = new Segitiga(6, 8);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}
