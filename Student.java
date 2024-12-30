import java.io.*;
import java.util.*;
//Chanlachat Panyoyai 672115006
class Student {
    int studentNumber;
    String firstName;
    String lastName;
    String faculty;

    Student(int studentNumber, String firstName, String lastName, String faculty) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return studentNumber + " " + firstName + " " + lastName + " " + faculty;
    }
}

