package day14_string;

import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases, it is not valid, tell the reason why

 */
public class Website {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);
        System.out.print("Enter the name of the website: ");
        String websiteUrl = key.next();

        boolean hasValidBeginning = websiteUrl.startsWith("www)");
        boolean hasValidEnding = websiteUrl.endsWith(".com") || websiteUrl.endsWith(".edu") || websiteUrl.endsWith(".gov")
        || websiteUrl.endsWith("net") || websiteUrl.endsWith(".io");


        if (hasValidBeginning && hasValidEnding) {
            System.out.println("The website is valid");
        }else {
            System.out.println("The website is not valid");
            if (!hasValidBeginning) {
                System.out.println("Beginning is not correct!");
            }

            if (!hasValidEnding) {
                System.out.println("Ending is not correct!");
            }
        }

    }
}
