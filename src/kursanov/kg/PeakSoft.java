package kursanov.kg;

import java.util.Arrays;

public class PeakSoft {

    private String name;

    private Address address;

    private Mentor[] mentors;

    private Student[] students;

    public PeakSoft(String name, Address address, Mentor[] mentors, Student[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "PeakSoft{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", mentors=" + Arrays.toString(mentors) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
