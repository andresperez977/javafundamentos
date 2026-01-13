package oopmodeling.grandingsystem;

public class SubjectGrade {

    private String subjectName;
    private double grade;

    public SubjectGrade(String subjectName, double grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return subjectName + ": " + grade;
    }
}