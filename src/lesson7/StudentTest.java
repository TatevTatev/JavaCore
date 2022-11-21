package lesson7;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student(
                "Poxos", "Poxosyan", 28, "095556565", "English");

        student.setName("Petros");
        System.out.println(student.getName());


    }
}
