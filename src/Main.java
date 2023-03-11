import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Create Variables
        double weight, height, result;

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Take Input
        System.out.println("Vücut Kitle İndeksi Hesaplama\n Kilonuzu Giriniz: ");
        weight = scanner.nextDouble();
        System.out.println("Boyunuzu Giriniz(cm): ");
        height = scanner.nextDouble()/100.0;

        // Calculations
        result = weight / (height * height);
        System.out.println("VKİ'niz: " + df.format(result));
    }
}