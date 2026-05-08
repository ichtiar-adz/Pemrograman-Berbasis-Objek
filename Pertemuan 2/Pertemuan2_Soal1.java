import java.util.Scanner;

public class Pertemuan2_Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai celcius: " );
        double celcius = input.nextDouble();


        double fahrenheit = (celcius * 9/5) + 32;  
        System.out.println("Nilai Fahrenheit: " + fahrenheit);
        input.close();

    }
}