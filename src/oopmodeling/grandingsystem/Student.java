package oopmodeling.grandingsystem;

import datastructure.FlexibleArray;

public class Student {

    private String name;
    private String id;
    private FlexibleArray<SubjectGrade> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        grades = new FlexibleArray<SubjectGrade>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void addGrade(SubjectGrade grade) {
        grades.add(grade);
    }

    public FlexibleArray<SubjectGrade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        String result = "Name: " + name + " | ID: " + id + "\n";
        for (int i = 0; i < grades.size(); i++) {
            result += "   - " + grades.get(i) + "\n";
        }
        return result;
    }
}