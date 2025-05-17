package day05_variables;

public class ConcateExample {
    public static void main(String[] args) {

        System.out.println(5 + 4 ); // NO CONCATENATION -- > 9
        System.out.println(5 + 4 + "Hello"); // ADDITION, CONCATENATION
        //                   9 + "Hello"
        //                      "9Hello"

        System.out.println("Hello" + 5 + 4);
        //                  "Hello5" + 4
        //                     "Hello54"

    }
}
