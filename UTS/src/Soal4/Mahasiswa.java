package Soal4;
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("123456", "John Doe", "Jl. Contoh No. 123", 'L');
        Mahasiswa mahasiswa2 = new Mahasiswa("789012", "Jane Smith", "Jl. Sample No. 456", 'P');

        System.out.println("Mahasiswa 1:");
        System.out.println("NIM: " + mahasiswa1.nim);
        System.out.println("Nama: " + mahasiswa1.nama);
        System.out.println("Alamat: " + mahasiswa1.alamat);
        System.out.println("Jenis Kelamin: " + mahasiswa1.jenisKelamin);

        System.out.println("\nMahasiswa 2:");
        System.out.println("NIM: " + mahasiswa2.nim);
        System.out.println("Nama: " + mahasiswa2.nama);
        System.out.println("Alamat: " + mahasiswa2.alamat);
        System.out.println("Jenis Kelamin: " + mahasiswa2.jenisKelamin);
    }
}

