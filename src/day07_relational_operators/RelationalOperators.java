package day07_relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // 5 > 2; ---> CORRECT / TRUE / RIGHT
        // 2 > 5; ---> INCORRECT / FALSE / WRONG

        System.out.println(5 > 2); // Hardcoded
        System.out.println(2 > 5);
        System.out.println();


        int a = 5;
        int b = 2;
        System.out.println(a > b); // using variables - Dynamic code
        System.out.println(b > a);
        System.out.println();

        boolean is5biggerThant2 = 5 > 2;
        boolean is2biggerThant5 = 2 > 5;
        System.out.println(is2biggerThant5);
        System.out.println(is5biggerThant2);
        System.out.println();

        boolean result1 = a > b;
        boolean result2 = b > a;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println();

        System.out.println(5 >= 5);
        System.out.println();

        int j = 30;
        int i = 45;
        System.out.println(i < j); // less than
        System.out.println(j <= i); // less than or equal
        j = 45;
        System.out.println(j <= i); // less than or equal
        System.out.println();


        System.out.println(4 == 4);
        System.out.println(4 == 5);
        System.out.println();

        // ! --- >  not operator
        // != -- >  not equal operator
        System.out.println(4 != 4);
        System.out.println(4 != 5);
        System.out.println(-4 != 4);


    }
}
