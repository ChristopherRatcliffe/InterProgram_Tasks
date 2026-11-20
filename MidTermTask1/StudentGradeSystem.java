import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][][] grades = new double[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};

        for (int section = 0; section < grades.length; section++) {
            System.out.println("=== Enter Grades for SECTION " + (section + 1) + " ===");
            for (int student = 0; student < grades[section].length; student++) {
                System.out.println("Student " + (student + 1) + ":");
                for (int subject = 0; subject < grades[section][student].length; subject++) {
                    System.out.print("  " + subjects[subject] + ": ");
                    grades[section][student][subject] = scanner.nextDouble();
                }
            }
            System.out.println();
        }

        System.out.println("\n================ GRADE REPORT ================\n");

        for (int section = 0; section < grades.length; section++) {
            System.out.println("SECTION " + (section + 1));
            System.out.println("-------------------------------");

            double sectionTotal = 0;
            int totalSectionGrades = 0;

            for (int student = 0; student < grades[section].length; student++) {
                System.out.println("Student " + (student + 1));

                double studentTotal = 0;

                for (int subject = 0; subject < grades[section][student].length; subject++) {
                    double grade = grades[section][student][subject];
                    // Prints whole numbers cleanly if no decimal was entered, or decimals if needed
                    System.out.printf("%s: %.0f%n", subjects[subject], grade);

                    studentTotal += grade;
                    sectionTotal += grade;
                    totalSectionGrades++;
                }

                double studentAverage = studentTotal / grades[section][student].length;
                System.out.printf("Student Average: %.2f%n%n", studentAverage);
            }

            double sectionAverage = sectionTotal / totalSectionGrades;
            System.out.printf("Section Average: %.2f%n%n%n", sectionAverage);
        }

        scanner.close();
    }
}


