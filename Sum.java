import java.util.Scanner;
import java.util.InputMismatchException;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        while (true) {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        }

        System.out.println(a + b);
    }
}
