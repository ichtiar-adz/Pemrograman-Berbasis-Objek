import java.util.Scanner;

public class Pertemuan7_Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Array
        String[] jenisPotong = new String[10];
        int[] harga = new int[10];
        int[] banyak = new int[10];
        int[] totalHarga = new int[10];
        
        System.out.println("  GEROBAK FRIED CHICKEN  ");
        System.out.println("=========================");
        System.out.println("Kode     Jenis    Harga");
        System.out.println("=========================");
        System.out.println("D        Dada     Rp2500");
        System.out.println("P        Paha     Rp2000");
        System.out.println("S        Sayap    Rp1500");
        System.out.println("=========================\n");

        System.out.print("Banyak Jenis : ");
        int banyakJenis = input.nextInt();

        int jumlahBayar = 0;

        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("Jenis Ke - " + (i + 1));
            System.out.print("Jenis Ayam [D/P/S] : ");
            char kode = input.next().toUpperCase().charAt(0);
            System.out.print("Banyak Potong      : ");
            banyak[i] = input.nextInt();

            if (kode == 'D') {
                jenisPotong[i] = "Dada";
                harga[i] = 2500;
            } else if (kode == 'P') {
                jenisPotong[i] = "Paha";
                harga[i] = 2000;
            } else {
                jenisPotong[i] = "Sayap";
                harga[i] = 1500;
            }

            totalHarga[i] = harga[i] * banyak[i];
            jumlahBayar += totalHarga[i];
            System.out.println();
        }

        System.out.println("\n\n                    GEROBAK FRIED CHICKEN");
        System.out.println("==============================================================");
        System.out.println("No.    Jenis Potong    Harga Satuan    Banyak Beli    Total");
        System.out.println("==============================================================");

        for (int i = 0; i < banyakJenis; i++) {
            System.out.printf("%-4d %-12s %-10d %-7d Rp %-10d\n", 
                (i + 1), jenisPotong[i], harga[i], banyak[i], totalHarga[i]);
        }

        double pajak = 0.1 * jumlahBayar;
        double totalBayar = jumlahBayar + pajak;

        System.out.println("==============================================================");
        System.out.printf("                                       Jumlah Bayar  Rp %d\n", jumlahBayar);
        System.out.printf("                                       Pajak 10%%     Rp %.0f\n", pajak);
        System.out.printf("                                       Total Bayar   Rp %.0f\n", totalBayar);
        
        input.close();
    }
}