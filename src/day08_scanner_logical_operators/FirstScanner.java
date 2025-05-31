package day08_scanner_logical_operators;

//import java.lang;  -- is imported automatically
import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        // Scanner input; --- >  'input' is the object reference name (non-primitive))
        // new Scanner(System.in); --- > object
        // int a;         --- >  'a' is the variable name (primitive)

        // Declared and instantiated Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        //String name = "Tom Jerry";
        String name = input.nextLine(); // "Feyruz"

        System.out.println();
        System.out.println("My name is: " + name);



    }
}
