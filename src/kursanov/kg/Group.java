package kursanov.kg;

import java.util.Arrays;

public class Group {
    private String name;

    private Student[] students;

    private int durationOfTheCourse;

    public Group(String name, Student[] students, int durationOfTheCourse) {
        this.name = name;
        this.students = students;
        this.durationOfTheCourse = durationOfTheCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getDurationOfTheCourse() {
        return durationOfTheCourse;
    }

    public void setDurationOfTheCourse(int durationOfTheCourse) {
        this.durationOfTheCourse = durationOfTheCourse;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", durationOfTheCourse=" + durationOfTheCourse +
                '}';
    }
}
