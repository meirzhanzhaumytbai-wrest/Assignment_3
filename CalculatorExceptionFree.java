public class CalculatorExceptionFree {
    public static void main(String[] args) {

        if (!isInt(args[0])) {
            System.out.println("Wrong Input: " + args[0]);
            return;
        }

        if (!isInt(args[2])) {
            System.out.println("Wrong Input: " + args[2]);
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String op = args[1];
        int r = 0;

        if (op.equals("+")) r = a + b;
        if (op.equals("-")) r = a - b;

        System.out.println(a + " " + op + " " + b + " = " + r);
    }

    static boolean isInt(String s) {
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }
}
