package inheritance.tugas;
public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(5);

        Dosen dosen1 = new Dosen("12345", "John Doe", "Jl. Aman 123");
        dosen1.setSKS(10);
        Dosen dosen2 = new Dosen("67890", "Jane Smith", "Jl. Selamat 456");
        dosen2.setSKS(15);

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
