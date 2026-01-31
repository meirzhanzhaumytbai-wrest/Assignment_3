public class Triangle {

    public Triangle(double a, double b, double c)
            throws IllegalTriangleException {

        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalTriangleException();
    }
}
