package Tugas;
public class Komputer {
    String merk;
    int kecProsesor;
    int sizeMemory;
    String jnsProsesor;

    Komputer() {
        
    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Prosesor: " + kecProsesor + " GHz");
        System.out.println("Size Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor: " + jnsProsesor);
    }
}
