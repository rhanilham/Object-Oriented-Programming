package inheritance.soal;
public class Lingkaran extends BangunDatar{
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return (float) (3.14 * r * r);
    }

    public float keliling() {
        return (float) (2 * 3.14 * r);
    }
}
