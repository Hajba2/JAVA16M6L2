package ex;

import java.util.Scanner;

public class Student {

    private String name;

    public Student(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim() != null && name.trim().length() >= 2) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("You are trying to create human with name less than two letters");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Student student = null;
        String name;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Please enter name");
            name = s.nextLine();
            student = new Student(name);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Please enter name one more time");
            name = s.nextLine();

            student = new Student(name);

        } finally {
            s.close();
        }


        System.out.println("student = " + student);
    }
}
