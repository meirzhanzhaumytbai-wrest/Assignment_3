public class Student {

    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {

        if (id <= 0)
            throw new IllegalArgumentException();

        if (name == null || name.equals(""))
            throw new IllegalArgumentException();

        for (int i = 0; i < name.length(); i++)
            if (!Character.isAlphabetic(name.charAt(i)))
                throw new IllegalArgumentException();

        if (gpa < 0.0 || gpa > 4.0)
            throw new IllegalArgumentException();

        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}
