package Tugas;
public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

    public static void main(String[] args) {
        Segitiga segitigaObjek = new Segitiga();

        int sudutHasil = segitigaObjek.totalSudut(60);
        System.out.println("Total Sudut: " + sudutHasil);

        sudutHasil = segitigaObjek.totalSudut(60, 30);
        System.out.println("Total Sudut: " + sudutHasil);

        int kelilingHasil = segitigaObjek.keliling(3, 4, 5);
        System.out.println("Keliling: " + kelilingHasil);

        double kelilingDouble = segitigaObjek.keliling(3, 4);
        System.out.println("Keliling: " + kelilingDouble);
    }
}

