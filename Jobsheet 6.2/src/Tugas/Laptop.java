package Tugas;
public class Laptop extends Komputer {
    String jnsBaterai;

    Laptop() {
        
    }

    Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai: " + jnsBaterai);
    }
    
}
