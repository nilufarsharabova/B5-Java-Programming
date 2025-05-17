package day03_comments_escape_sequence;

public class EscapeSequenceQuote {

    public static void main (String[] args){
        /*
            Q: To be able to print we need double quotes. How do we print double quotes itself?
                Ex: Programming Language "Java" is great one.
            A: We can use ESCAPE SEQUENCE  sequence. ---- > \

                \ --- > back slash
                / --- > forward slash
         */

        System.out.println("Programming language Java is great one.");
        System.out.println("Programming language \"Java\" is great one.");


        /*
            Q: Since we use BACKWARD SLASH for double quotes, how do we print the BACKWARD SLASH itself?
                EX: Today is 05\10\2025

         */
        System.out.println("Today is 05 10 2025");
        System.out.println("Today is 05/10/2025");
        System.out.println("Today is 05\\10\\2025");
        System.out.println("Today is 05\10\\2025"); // 5\10 is LOST. Some data is LOST

        // How about if I want to print double backward slash
        System.out.println("Today is 05\\\\10\\\\2025");


        // SINGLE QUOTE with ESCAPE SEQUENCE
        System.out.println("Today is 05\'10\'2025"); // Here backward slash (\) is redundant. But still works.So we can remove it.
        System.out.println("Today is 05'10'2025");


    }
}
