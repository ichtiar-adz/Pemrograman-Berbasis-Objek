import java.util.Scanner;

public class Pertemuan2_Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nama Siswa : ");
        String nama = sc.nextLine();

        System.out.print("Nilai UTS : ");
        double uts = sc.nextDouble();

        System.out.print("Nilai UAS : ");
        double uas = sc.nextDouble();

        System.out.print("Nilai Tugas Mandiri : ");
        double tugas = sc.nextDouble();

        double murniUTS = uts * 0.35;
        double murniUAS = uas * 0.45;
        double murniTugas = tugas * 0.20;

        double nilaiAkhir = murniUTS + murniUAS + murniTugas;

        System.out.println("\nNilai Murni yang diperoleh :");
        System.out.println("\nNama Siswa :" + nama);
        System.out.println("Nilai Murni UTS : " + murniUTS);
        System.out.println("Nilai Murni UAS : " + murniUAS);
        System.out.println("Nilai Murni Tugas : " + murniTugas);
        System.out.println("Nilai Akhir yang diperoleh yaitu : " + nilaiAkhir);

        sc.close();
    }
}