package Tugas;
public class PC extends Komputer {
    int ukuranMonitor;

    PC() {
        
    }

    PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    void tampilPC() {
        tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
    
}
