import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Try-with-resources statement to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Kalkulator Sederhana");
            System.out.print(" Masukkan angka pertama : ");
            double num1 = scanner.nextDouble();

            System.out.print("Pilih operasi (+, -, *, /) : ");
            char operation = scanner.next().charAt(0);

            System.out.print(" Masukkan angka kedua : ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
                    return;
            }

            System.out.println("Hasil: " + result);
        } // The scanner will be closed automatically here
    }
}
