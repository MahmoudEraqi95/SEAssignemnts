package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.util.ArrayList;
import java.util.Date;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(123, "Mahmoud", new Date());
        Student s2 = new Student(1234, "Saad", new Date());
        Student s3 = new Student(12312, "Mohamed", new Date(77716000));
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println("all students:");
        printListOfStudents(students);
        ArrayList<Student> plStudents = getListOfPlatinumAlumniStudents(students);
        System.out.println("platinum students:");
      printListOfStudents(plStudents);
    }

    private static ArrayList<Student> getListOfPlatinumAlumniStudents(ArrayList<Student> students) {
        ArrayList<Student> sts = new ArrayList<>();
        students.stream().filter(it->it.getDateOfAdmission().before(new Date(777168000))).sorted().forEach(
                sts::add
        );
        return sts;
    }

    private static void printListOfStudents(ArrayList<Student> students) {

        for(Student s: students){
            System.out.println("id:"+s.getStudentId()+" name:"+s.getName());
        }

    }
}
