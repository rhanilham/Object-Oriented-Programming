package Tugas;
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: objek Dosen dapat merujuk pada kelas Manusia
        Manusia manusia1 = new Dosen();
        manusia1.bernafas(); // Manusia bernafas
        manusia1.makan();    // Dosen makan (dynamic method dispatch)

        // Polimorfisme: objek Mahasiswa dapat merujuk pada kelas Manusia
        Manusia manusia2 = new Mahasiswa();
        manusia2.bernafas(); // Manusia bernafas
        manusia2.makan();    // Mahasiswa makan (dynamic method dispatch)

        // Khusus untuk objek Dosen
        Dosen dosen = new Dosen();
        dosen.lembur(); // Dosen lembur

        // Khusus untuk objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur(); // Mahasiswa tidur
    }  
}
