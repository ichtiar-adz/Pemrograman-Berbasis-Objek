
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Input N: ");
        N = input.nextInt();
        while (N <= 3 ) {
            System.out.println("Nama ke-" + N);
            N++;
        }
    }
}