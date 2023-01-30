package class11.Student;

import class11.junk.Date;

import java.util.Arrays;

public class Student {
    private String name; // name of the student
    private Date bd; // date of the student's birth
    private int[] grades; // student's grades

    /*
     * The constructor creates a new Student with the
     * given name, date of birth, and number of grades.
     */
    public Student(String name, Date bd, int n) {
        this.name = name;
        this.bd = new Date(bd.getYear(), bd.getMonth(), bd.getDay());
        this.grades = new int[n];

        Arrays.fill(this.grades, 0);
    }

    // gets the student's name
    public String getName() {
        return this.name;
    }

    // gets the student's date of birth
    public Date getBd() {
        return this.bd;
    }

    // gets the student's grades
    public int getGrades() {
        return this.grades.length;
    }

    // sets the student's name
    public void setName(String name) {
        this.name = name;
    }

    // sets the student's date of birth
    public void setBd(Date bd) {
        this.bd = bd;
    }

    // sets the student's grades
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String toString() {
        String st = this.name + ", " + this.bd;

        for (int i : this.grades) {
            st += ", " + i;
        }

        return st;
    }

    // calculates the student's average grades and returns the result.
    public double avg() {
        double sum = 0.0;

        for (int i : this.grades) {
            sum += i;
        }

        return sum/this.grades.length;
    }
}

