import java.util.Scanner;

class Mahasiswa {
    String nama;
    double tugas, uts, uas, akhir;
    String grade;
}

public class UTS_PBO_Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        
        do {
            System.out.println("==================================================");
            System.out.println(" PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.println("==================================================");
            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int jumlah = input.nextInt();
            
            Mahasiswa[] dataMhs = new Mahasiswa[jumlah];
            
            for (int i = 0; i < jumlah; i++) {
                dataMhs[i] = new Mahasiswa(); 
                
                System.out.println("Mahasiswa Ke - " + (i + 1));
                input.nextLine();
                
                System.out.print("Nama Mahasiswa  : ");
                dataMhs[i].nama = input.nextLine();
                
                System.out.print("Nilai Tugas     : ");
                dataMhs[i].tugas = input.nextDouble();
                
                System.out.print("Nilai UTS       : ");
                dataMhs[i].uts = input.nextDouble();
                
                System.out.print("Nilai UAS       : ");
                dataMhs[i].uas = input.nextDouble();
                
                double nTugas = dataMhs[i].tugas * 0.30;
                double nUts = dataMhs[i].uts * 0.30;
                double nUas = dataMhs[i].uas * 0.40;
                
                dataMhs[i].akhir = nTugas + nUts + nUas;
                
                if (dataMhs[i].akhir >= 80) {
                    dataMhs[i].grade = "A";
                } else if (dataMhs[i].akhir >= 70) {
                    dataMhs[i].grade = "B";
                } else if (dataMhs[i].akhir >= 59) {
                    dataMhs[i].grade = "C";
                } else if (dataMhs[i].akhir >= 50) {
                    dataMhs[i].grade = "D";
                } else {
                    dataMhs[i].grade = "E";
                }
                System.out.println();
            }
            
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("                             DAFTAR NILAI");
            System.out.println("                        MATERI PEMROGRAMAN PBO");
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%-4s | %-20s | %-6s | %-6s | %-6s | %-6s | %-5s\n", 
                    "No.", "Nama Mahasiswa", "Tugas", "UTS", "UAS", "Akhir", "Grade");
            System.out.println("--------------------------------------------------------------------------");
            
            for (int i = 0; i < jumlah; i++) {
                System.out.printf("%-4d | %-20s | %-6.1f | %-6.1f | %-6.1f | %-6.1f | %-5s\n", 
                        (i + 1), dataMhs[i].nama, dataMhs[i].tugas, dataMhs[i].uts, dataMhs[i].uas, dataMhs[i].akhir, dataMhs[i].grade);
            }
            System.out.println("--------------------------------------------------------------------------");
            
            System.out.print("\nIngin mengulang program dari awal? (Y/T): ");
            ulangi = input.next().charAt(0);
            System.out.println();
            
        } while (ulangi == 'Y' || ulangi == 'y');
        
        System.out.println("Program pendataan nilai ditutup. Terima kasih!");
        
        input.close();
    }
}