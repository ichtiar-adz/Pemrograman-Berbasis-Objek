
import java.util.Scanner;

public class NestedIfFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int bilangan = 0;
        do {
            System.out.print("Masukkan bilangan: ");
            bilangan = input.nextInt();

            while (bilangan >= 0) {
                while (bilangan % 2 == 0) {
                    System.out.println("Bilangan genap");
                    System.out.print("Masukkan bilangan: ");
                    bilangan = input.nextInt();
                    break;

                }
                System.out.println("Bilangan ganjil");
                System.out.print("Masukkan bilangan: ");
                bilangan = input.nextInt();

            }
            System.out.print("Apakah anda ingin mengulang? (y/n): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
}