public class TriangleTest {
    public static void main(String[] args) {
        try {
            new Triangle(3, 4, 5);
            System.out.println("OK");
        } catch (IllegalTriangleException e) {
            System.out.println("FAIL");
        }

        try {
            new Triangle(1, 2, 10);
            System.out.println("FAIL");
        } catch (IllegalTriangleException e) {
            System.out.println("OK");
        }
    }
}
