package Tugas3;
public class Lingkaran {
    public double phi = 3.14;
    public double hitungLuas;
    public double hitungKeliling;

    public double hitungLuas(double r) {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling(double r) {
        double keliling = 2 * phi * r;
        return keliling;
    }

    public void tampilLingkaran() {
        System.out.println("Luas lingkaran adalah: " + hitungLuas);
        System.out.println("Keliling lingkaran adalah: " + hitungKeliling);
    }
}
