import java.util.Scanner;

public class UTS_PBO_Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi = 0;

        do {
            System.out.print("Pilih jenis kelamin (L/P)            : ");
            char jk = input.next().charAt(0);

            System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
            int tinggiBadan = input.nextInt();

            int bbIdeal = 0; 
            
            if (jk == 'l' || jk == 'L') {
                bbIdeal = tinggiBadan - 100;
            } else if (jk == 'p' || jk == 'P') {
                bbIdeal = tinggiBadan - 110;
            } else {
                System.out.println("Pilihan jenis kelamin tidak valid!");
                continue;
            }

            System.out.println("Berat badan ideal yang seharusnya    : " + bbIdeal + " Kg");

            System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
            int beratBadan = input.nextInt();

            if (beratBadan <= bbIdeal) {
                int beda = bbIdeal - beratBadan; 
                System.out.println("Anda termasuk kedalam kategori Kurus dan harus menambah berat badan sebanyak " 
                        + beda + " Kg (" + bbIdeal + " Kg - " + beratBadan + " Kg)");
            } else {
                int beda = beratBadan - bbIdeal;
                System.out.println("Anda termasuk kedalam kategori Gemuk dan harus mengurangi berat badan sebanyak " 
                        + beda + " Kg (" + beratBadan + " Kg - " + bbIdeal + " Kg)");
            }

            System.out.print("\nIngin mengulang program? (Y/T): ");
            ulangi = input.next().charAt(0);
            System.out.println();

        } while (ulangi == 'y' || ulangi == 'Y');
        
        System.out.println("Program selesai. Semangat mencapai berat badan idealnya!");

        input.close();
    }
}