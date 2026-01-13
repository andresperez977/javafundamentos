package oopmodeling.grandingsystem;

import datastructure.FlexibleArray;

public class Gradebook {

    protected FlexibleArray<Student> students;

    public Gradebook() {
        students = new FlexibleArray<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                return students.get(i);
            }
        }
        return null;
    }

    public void showStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public boolean removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}