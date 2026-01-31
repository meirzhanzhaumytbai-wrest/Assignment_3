import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        int[] a = new int[100];
        Random r = new Random();

        for (int i = 0; i < 100; i++)
            a[i] = r.nextInt();

        Scanner sc = new Scanner(System.in);

        try {
            int i = sc.nextInt();
            System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
