package Tugas;
public class Main {
    public static void main(String[] args) {
        Mac macBook = new Mac("Apple", 4, 16, "Intel", "Li-ion", "Touch ID");
        Windows surface = new Windows("Microsoft", 2, 8, "AMD", "Li-Po", "Surface Pen Support");

        System.out.println("=======Data Mac=======");
        macBook.tampilMac();
        System.out.println("\n======Data Windows=======");
        surface.tampilWindows();
    }
}