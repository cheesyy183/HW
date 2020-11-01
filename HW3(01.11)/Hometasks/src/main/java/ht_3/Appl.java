package ht_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        List<Student> university = new ArrayList();

        university.add(new Student("Bohdan", 3));
        university.add(new Student("Orest", 3));
        university.add(new Student("Ira", 1));
        university.add(new Student("Stepan", 1));
        university.add(new Student("Marta", 2));

        Student.printStudents(university, 3);
        Student.printStudents(university, 1);
    }
}

class Student {
    public class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public class CourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse().compareTo(st2.getCourse());
        }
    }

    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public static void printStudents(List students, Integer course) {
        Iterator iterator = students.iterator();

        System.out.println();
        System.out.println("Students on " + course + " course: ");

        while (iterator.hasNext()) {
            Student temp_student = (Student)iterator.next();

            if (temp_student.getCourse().equals(course)) {
                System.out.println(temp_student.getName());
            }
        }
    }
}
