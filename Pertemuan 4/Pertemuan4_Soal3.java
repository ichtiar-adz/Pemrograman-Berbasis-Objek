import java.util.Scanner;

public class Pertemuan4_Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merek, ukuran;
        int jumlahBeli;
        int hargaSatuan = 0;

        System.out.println("TOKO KELONTONG WOWO");
        System.out.println("--------------------------");
        System.out.print("Masukan Merk Susu [DANCOW|BENDERA|SGM] : ");
        merek = input.nextLine().toUpperCase();
        
        System.out.print("Masukan Ukuran Kaleng [KECIL|SEDANG|BESAR] : ");
        ukuran = input.nextLine().toUpperCase();

        switch (merek) {
            case "DANCOW":
                if (ukuran.equals("KECIL")) {
                    hargaSatuan = 25000;
                } else if (ukuran.equals("SEDANG")) {
                    hargaSatuan = 20000;
                } else if (ukuran.equals("BESAR")) {
                    hargaSatuan = 15000;
                }
                break;
            case "BENDERA":
                if (ukuran.equals("KECIL")) {
                    hargaSatuan = 20000;
                } else if (ukuran.equals("SEDANG")) {
                    hargaSatuan = 17500;
                } else if (ukuran.equals("BESAR")) {
                    hargaSatuan = 13500;
                }
                break;
            case "SGM":
                if (ukuran.equals("KECIL")) {
                    hargaSatuan = 22000;
                } else if (ukuran.equals("SEDANG")) {
                    hargaSatuan = 18500;
                } else if (ukuran.equals("BESAR")) {
                    hargaSatuan = 15000;
                }
                break;
            default:
                System.out.println("Merek tidak ditemukan!");
        }

        System.out.println("Harga Satuan Barang Rp " + hargaSatuan);
        System.out.print("Jumlah Yang dibeli : ");
        jumlahBeli = input.nextInt();

        int totalHarga = hargaSatuan * jumlahBeli;

        System.out.println("Biaya yang harus dibayar sebesar Rp " + totalHarga);

        input.close();
    }
}