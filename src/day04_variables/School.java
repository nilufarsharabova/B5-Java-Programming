package day04_variables;
/*
    Task:
        class name: School

        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5

            total number of students in your school


    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main(String[] args) {

        // NAMING CONVENTIONS - RULES
        // camelCale
        // any letters
        // any number can be anywhere EXCEPT beginning
        // 2 special characters allowed anywhere --- > $, _ (no other special characters)

        int numberOfStudentsInGrade1 = 44;
        int numberOfStudentsInGrade2 = 50;
        int numberOfStudentsInGrade3 = 20;
        int numberOfStudentsInGrade4 = 70;
        int numberOfStudentsInGrade5 = 150;


        //int totalNumberOfStudents = 40 + 50 + 20 + 70 + 150;  // Hardcoded
        int totalNumberOfStudents = numberOfStudentsInGrade1 +  // Dynamically
                numberOfStudentsInGrade2 +
                numberOfStudentsInGrade3 +
                numberOfStudentsInGrade4 +
                numberOfStudentsInGrade5;


        System.out.println("Num of students in grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Num of students in grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Num of students in grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Num of students in grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Num of students in grade 5: " + numberOfStudentsInGrade5);


        System.out.println("\nSCHOOL INFO:");
        System.out.println("\tTotal number of students in School: " + totalNumberOfStudents);


        double numberOfSchoolDaysInYear = 100.5;
        double numberOfSnowDaysInYear = 20.5;
        double averageGPA = 3.5;


        System.out.println("\tNumber of School Days in Year: " + numberOfSchoolDaysInYear);
        System.out.println("\tNumber of Snow Days in Year: " + numberOfSnowDaysInYear);
        System.out.println("\tAverage GPA in School: " + averageGPA);





    }
}
