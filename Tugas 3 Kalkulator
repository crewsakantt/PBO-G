import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi: ");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        String input1 = scanner.next();
        System.out.print("Masukkan angka kedua: ");
        String input2 = scanner.next();

        try {
            if (input1.contains(".") || input2.contains(".")) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                hitung(pilihan, num1, num2);
            } else {
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);
                hitung(pilihan, num1, num2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid, masukkan angka yang benar.");
        }

        scanner.close();
    }

    public static void hitung(int operasi, int num1, int num2) {
        switch (operasi) {
            case 1:
                System.out.println("Hasil: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Hasil: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Hasil: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Hasil: " + (num1 / num2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak valid.");
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }

    public static void hitung(int operasi, double num1, double num2) {
        switch (operasi) {
            case 1:
                System.out.println("Hasil: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Hasil: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Hasil: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Hasil: " + (num1 / num2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak valid.");
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }
}
