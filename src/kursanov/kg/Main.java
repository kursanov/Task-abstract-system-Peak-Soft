package kursanov.kg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        boolean ss = true;

        Student student1 = new Student("Nurislam",Gender.MALE,"nuris@mail.com");
        Student student2 = new Student("Urmat",Gender.MALE,"urmat@mail.com");
        Student student = new Student("Urmat",Gender.MALE,"urmat@mail.com");
        Student student3 = new Student("Nurgazy",Gender.MALE,"nurgaz@mail.com");
        Student student4 = new Student("Kuba",Gender.FEMALE,"kuba@mail.com");
        Student student5 = new Student("Zukh",Gender.FEMALE,"zukh@mail.com");
        Student student6 = new Student("Nurlan",Gender.MALE,"nur@mail.com");
        Student[] students = {student1,student2,student3,student4,student5,student6,student};


        Group java12 = new Group("java12",students,9);
        Group java13 = new Group("java13",students,9);

        Mentor mentor1 = new Mentor("Datka",Gender.FEMALE,"datka@gmail.com",java12);
        Mentor mentor2 = new Mentor("Aizat",Gender.FEMALE,"aizat@gmail.com",java13);
        Mentor[] mentors = {mentor1,mentor2};


        PeakSoft peakSoft = new PeakSoft("PeakSoft",Address.GRAJDANSKAIA119,mentors,students);




        while (true){
        System.out.println("""
                1.Get all mentors
                2.Get all students
                3.Search student by name
                4.Search by mentor email
                5.Search by student name
                6 Only female or male genders
                """);



        int s = scanner.nextInt();

        scanner.nextLine();
        switch (s){

            case 1 ->{
                getAllMentors(mentors);
            }
            case 2 -> {
                getAllStudents(students);
            }
            case 3 ->{
                System.out.println("Aт жазыныз : ");
                searchStudentName(students,scanner.nextLine());
            }
            case 4 ->{
                System.out.println("Ментордун Emailын жазыныз : ");
                searchByMentorEmail(mentors,scanner.nextLine());
            }
            case 5 ->{
                sortByStudentName(students);
                getAllStudents(students);
            }
            case 6 ->{
                Student[] filteredStudents = onlyFemaleOrMaleGenders(students, Gender.FEMALE);
                getAllStudents(filteredStudents);

            }}
        }

    }
    public static void getAllMentors(Mentor[] mentors){
        for (Mentor mentor : mentors) {
            System.out.println(mentor+"\n ");
        }
    }


    public static void getAllStudents(Student[] students){
        for (Student student : students) {
            System.out.println(student+"\n");
        }
    }

    public static void searchStudentName(Student[] students,String name){
        boolean foundName = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)){
                System.out.println(student);
                foundName = true;
                break;
            }
        }if (!(foundName)){
            System.out.println("Мындай студент жок");
        }
        }


    public static void searchByMentorEmail(Mentor[] mentors,String email){
        boolean foundEmail = false;
        for (Mentor mentor : mentors) {
            if (mentor.getEmail().equalsIgnoreCase(email)){
                System.out.println(mentor);
                foundEmail = true;
                break;
            }
        }if (!(foundEmail)){
            System.out.println("Mындай email менен ментор жок!");
        }
    }
    public static void sortByStudentName(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    public static  Student[]  onlyFemaleOrMaleGenders(Student[] students,Gender gender){
        Student[]students1 = new Student[students.length];
        int count = 0;
        for (Student student : students) {
            if (student.getGender().equals(gender)){
                students1[count] = student;
                 count++;
            }
        }
        Student[] result = new Student[count];
        System.arraycopy(students1, 0, result, 0, count);

        return result;

    }

}