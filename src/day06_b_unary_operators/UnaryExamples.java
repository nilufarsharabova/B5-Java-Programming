package day06_b_unary_operators;

public class UnaryExamples {
    public static void main(String[] args) {
        // int y = +5; // We all know if a value does not have +, it also means that it is a positive number
        int y = 5;
        System.out.println(y); // 5

        y = -y;  // (-1 * 5) I re-assigned y to its previous value by making it negative
        System.out.println(y); // -5

        y = -20; // (-1 * 20)
        System.out.println(y); // -20

        y = +y; // (+1 * -20 = -20)
        System.out.println(y);
        y = -y; // -1 * -20
        System.out.println(y);

        System.out.println("-----------------");

        int x = 0;
        System.out.println(x);
        x = x + 1; // Incremented x by adding 1 to its previous value and reassinged to x | x = 1;
        System.out.println(x);

        x = x + 1; // x = 2;
        System.out.println(x);

        System.out.println("-----------------");
        // INCREMENT
        // POST increment
        x++; // x = x + 1; x = 3;
        System.out.println(x);

        // PRE increment
        ++x; // x = x + 1; x = 4
        System.out.println(x);

        // Q: then what is the difference between PRE increment and POST increment ???

        System.out.println("-----------------");
        // DECREMENT
        int i = 10;
        System.out.println(i);

        i = i - 1; // i = 10 - 1; i = 9;
        System.out.println(i);

        // POST decrement
        i--; // i = i - 1;  i = 8;
        System.out.println(i);

        // PRE decrement
        --i; // i = i - 1; i = 7;
        System.out.println(i);

        // Q: then what is the difference between PRE decrement and POST decrement ???

        // A: Up until here (line 60), we used ACTION of INCREMENT or DECREMENT in one line and USED it in another line in println statement
        // A: But sometimes, we need to do the 2 actions in ONE statement (println statement)

        System.out.println("-----------------");
        int z = 10;
        System.out.println(z = z - 1);  // UPDATE the value of z and used
        System.out.println(z); // z = 9

        z = 10;
        // z--;
        System.out.println(z--); // 2 actions: 1-USE is first, 2-UPDATE (POST)
        //   print z --- > 10
        //   z = z - 1 --> 9

        z = 10;
        // --z;
        System.out.println(--z); // 2 actions: 1-UPDATE(PRE) is first, 2-USE
        //      z = z - 1; --> 9
        //      print z ---- > 9


    }
}
