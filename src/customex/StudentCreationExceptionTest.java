package customex;

import java.util.Scanner;

public class StudentCreationExceptionTest {

    public static void main(String[] args) {
        createStudent();
    }

    public static void createStudent() {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        Student a;
        try {
            a = new Student(name);
        } catch (StudentCreationException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getName() + " is incorrect name");
        } finally {
            s.close();
        }
    }
}
