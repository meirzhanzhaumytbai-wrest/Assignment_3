public class Calculator {
    public static void main(String[] args) {

        int a;
        int b;

        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + args[0]);
            return;
        }

        try {
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + args[2]);
            return;
        }

        String op = args[1];
        int r = 0;

        if (op.equals("+")) r = a + b;
        if (op.equals("-")) r = a - b;

        System.out.println(a + " " + op + " " + b + " = " + r);
    }
}
