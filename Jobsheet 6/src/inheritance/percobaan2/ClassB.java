package inheritance.percobaan2;
public class ClassB extends ClassA {
    private int z;
    
    public void setZ(int z){
        this.z = z;
    }
    
    public int getZ() {
        return z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai z: " + z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah: " + (getX() + getY() + z));
    }
}