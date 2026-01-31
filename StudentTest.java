public class StudentTest {
    public static void main(String[] args) {
        try {
            new Student(1, "Ali", 3.5);
            System.out.println("OK");
        } catch (IllegalArgumentException e) {
            System.out.println("FAIL");
        }

        try {
            new Student(0, "Ali", 3.5);
            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("OK");
        }

        try {
            new Student(1, "", 3.5);
            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("OK");
        }

        try {
            new Student(1, "Ali1", 3.5);
            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("OK");
        }

        try {
            new Student(1, "Ali", 4.5);
            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("OK");
        }
    }
}
