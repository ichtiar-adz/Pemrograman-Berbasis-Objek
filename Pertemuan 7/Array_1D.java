import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int elemen = 0;
        System.out.print("Tentukan jumlah elemen array: ");
        elemen = input.nextInt();

        int[] nilai = new int[elemen];
        int a;

        for (a = 0; a < elemen; a++) {
            System.out.print("Masukkan nilai index ke-" +a+ ": ");
            nilai[a] = input.nextInt();
        }

        for (a = 0; a < elemen; a++) {
            System.out.println("Nilai array index-" +a+ ": " + nilai[a]);
        }
    }
}