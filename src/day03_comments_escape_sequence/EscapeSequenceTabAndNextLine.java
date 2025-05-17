package day03_comments_escape_sequence;

public class EscapeSequenceTabAndNextLine {
    public static void main (String[] args){

        // \t --- > is for TAB which is equal to 4 spaces from beginning.
        System.out.println("This is not tabbed");
        System.out.println("    This is not tabbed");
        System.out.println("        This is not tabbed");
        System.out.println("        8 spaces");

        System.out.println("This is tabbed");
        System.out.println("\t\tThis is tabbed");
        System.out.println("u\t\tThis is tabbed");

        System.out.println("-------------------------------------------------------------------------------");



        // \n --- > is for next line.
        System.out.print("This is all about NEW LINE with ESCAPE SEQUENCE.\nHere we used escape sequence");
        //System.out.println("Here we used escape sequence");
        System.out.println("\nNew Line");



    }
}
