
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int bilangan;
            System.out.print("Masukkan sebuah bilangan(1-100): ");
            bilangan = input.nextInt();

            // if (bilangan < 1) {
            //     System.out.println(bilangan + " Adalah Bilangan Kurang dari 1");
            // } else if (bilangan > 100) {7
            //     System.out.println(bilangan + " Adalah Bilangan lebih dari 100");
            // }

            if (bilangan < 1 || bilangan > 100) {
                System.out.println(bilangan + " adalah bilangan kurang dari 1");
                System.out.println(bilangan + " adalah bilangan lebih dari 100");
            } else {
                System.out.println(bilangan + " Anda memasukan bilangan yang benar");
                if (bilangan % 2 == 0) {
                    System.out.println(bilangan + " adalah Bilangan Genap");
                } else {
                    System.out.println(bilangan + " adalah Bilangan Ganjil");
                }
            }
        }
    }
}