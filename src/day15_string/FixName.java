package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String firstName = key.next();

        System.out.println("Please, enter your last name: ");
        String lastName = key.next();

        System.out.println("--------------------------------");
        System.out.println("Your full name (before fix): " + firstName + " " + lastName);



    }
}
