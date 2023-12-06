package Tugas;
public class Mac extends Laptop {
    String security;

    Mac() {
        
    }

    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    void tampilMac() {
        tampilLaptop();
        System.out.println("Security: " + security);
    }
    
}
