import java.util.Scanner;

class Lingkaran {
    double radius;
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    public double luas() {
        return Math.PI * radius * radius;
    }
    public double keliling() {
        return 2 * Math.PI * radius;
    }
}
public class Pertemuan7_Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        Lingkaran bunderan = new Lingkaran(r);
        System.out.println("--- Hasil Perhitungan ---");
        System.out.printf("Luas Lingkaran     : %.2f\n", bunderan.luas());
        System.out.printf("Keliling Lingkaran : %.2f\n", bunderan.keliling());
        
        input.close();
    }
}