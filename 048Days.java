import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        double a, b, hasil;
        char oper;

        a = hi.nextDouble();

        oper = hi.next().charAt(0);

        b = hi.nextDouble();

        switch (oper) {
            case '+':
                hasil = a + b;
                break;

            case '-':
                hasil = a - b;
                break;

            case '*':
                hasil = a * b;
                break;

            case '%':
                hasil = a % b;
                break;

            case '/':
                if (b != 0) {
                    hasil = a / b;
                } else {
                    System.out.println("Tidak bisa dibagi dengan nol!");
                    hi.close();
                    return;
                }
                break;

            default:
                System.out.println("Eror!");
                hi.close();
                return;
        }

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("Hasil dari " + a + " " + oper + " " + b + " adalah " + hasil);

        hi.close();
    }
}
