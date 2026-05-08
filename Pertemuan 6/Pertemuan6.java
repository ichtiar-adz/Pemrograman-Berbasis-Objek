
public class Pertemuan6 {

    public static void main(String[] args) {
        System.out.println("Contoh nested for:");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        //no 1
        System.out.println("\n no 1");
        int n = 5;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b < n; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //no 2
        System.out.println("\n no 2");
        int j = 5;
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < j; b++) {
                System.out.print(" ");

                if (a == b || a + b == j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //no 3
        System.out.println("\n no 3");
        int h = 5;
        for (int a = h; a >= 1; a--) {

            for (int b = h; b > a; b--) {
                System.out.print(" ");
            }

            // Loop angka
            for (int c = 1; c <= a; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //no 4
        System.out.println("\n no 4");
        for (int a = 5; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {

                System.out.print("" + b + " ");
            }
            System.out.println();
        }

        //no 5
        System.out.println("\n no 5");
        int m = 5; // Tinggi segitiga

        for (int i = 1; i <= m; i++) {
            // 1. Loop untuk mencetak spasi (pendorong)
            // Semakin besar i, semakin sedikit spasi yang dicetak
            for (int j1 = m; j1 > i; j1--) {
                System.out.print("  "); // Pakai dua spasi agar seimbang dengan "* "
            }

            // 2. Loop untuk mencetak bintang
            // Semakin besar i, semakin banyak bintang yang dicetak
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Pindah baris
        }
    }
}