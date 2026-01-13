package oopmodeling.grandingsystem;

import java.util.Scanner;
public class GradeApp {

	static Gradebook gradeBook = new Gradebook();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        byte option;

        do {
            showMenu();
            option = scanner.nextByte();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGradeToStudent();
                    break;
                case 3:
                    gradeBook.showStudents();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 5);
    }

    private static void addStudent() {
        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Student ID: ");
        String id = scanner.nextLine();

        gradeBook.addStudent(new Student(name, id));
        System.out.println("Student added");
    }

    private static void addGradeToStudent() {
        System.out.print("Student name: ");
        String name = scanner.nextLine();

        Student student = gradeBook.findStudent(name);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        System.out.print("Subject name: ");
        String subject = scanner.nextLine();

        System.out.print("Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        student.addGrade(new SubjectGrade(subject, grade));
        System.out.println("Grade added");
    }

    private static void removeStudent() {
        System.out.print("Student name: ");
        String name = scanner.nextLine();

        if (gradeBook.removeStudent(name)) {
            System.out.println("Student removed");
        } else {
            System.out.println("Student not found");
        }
    }

    private static void showMenu() {
        System.out.println("\n--- GRADING SYSTEM ---");
        System.out.println("1. Add student");
        System.out.println("2. Add grade to student");
        System.out.println("3. Show students");
        System.out.println("4. Remove student");
        System.out.println("5. Exit");
    }
}

