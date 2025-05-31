package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter two numbers: ");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();
        System.out.print("\tNumber2: ");
        int num2 = keyboard.nextInt();

        boolean areNumbersEqual = num1 == num2;
        System.out.println("Are numbers equal: " + areNumbersEqual);


    }
}
