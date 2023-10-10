package rhanilham.relasiclass.percobaan1;
public class Laptop {
    private String merk;
    private Processor proc;
    
    public Laptop() {      
    }
    
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor getProcessor() {
        return proc;
    }

    public void setProcessor(Processor proc) {
        this.proc = proc;
    }
    
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
