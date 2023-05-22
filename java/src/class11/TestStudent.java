package class11;

import class11.Date;

import java.util.Scanner;

public class TestStudent {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of students in the class: ");
        Student[] Class = new Student[reader.nextInt()];
        // while () {}
    }

    public static Student createStudent() {
        System.out.println("Enter student's name: ");
        String Name = reader.nextLine();

        System.out.println("Enter the birth year: ");
        int Year = reader.nextInt();

        System.out.println("Enter the birth month: ");
        int Month = reader.nextInt();

        System.out.println("Enter the birth day: ");
        int Day = reader.nextInt();

        System.out.println("Enter number of grades: ");
        int n = reader.nextInt();

        int[] grades = new int[n];
        for (int grade : grades) {
            System.out.println("Enter your grade: ");
            grade = reader.nextInt();
        }

        Student newStudent =new Student(Name, new Date(Year, Month, Day), n);
        newStudent.setGrades(grades);

        return newStudent;
    }

    public void addStudent(Student[] Class, Student student) {
        for (Student s : Class) {
            if (s == student) {
                return;
            }
        }

        for (int i = 0; i < Class.length; i++) {
            if (Class[i] == null) {
                Class[i] = student;
                return;
            }
        }
    }

    public void printClass(Student[] Class) {
        for (Student student : Class) {
            System.out.println(student.toString());
        }
    }

    public Student getHighestGradesStudent(Student[] Class) {
        if (Class[0] == null) {
            return null;
        }

        Student s = Class[0];

        for (int i=1; i<Class.length; i++) {
            if (Class[i] != null) {
                if (Class[i].avg() > s.avg()) {
                    s = Class[i];
                }
            }
        }

        return s;
    }
}

