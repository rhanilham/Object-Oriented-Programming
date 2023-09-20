package Tugas3;
import java.util.Scanner;
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        Lingkaran lkr = new Lingkaran();
        lkr.hitungLuas = lkr.hitungLuas(r);
        lkr.hitungKeliling = lkr.hitungKeliling(r);
        lkr.tampilLingkaran();
    }
}
