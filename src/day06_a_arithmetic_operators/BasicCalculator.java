package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 7; // double > int | IMPLICIT CASTING -- > 7.0
        double num2 = 5; // double > int | IMPLICIT CASTING -- > 5.0

        double additionResult = num1 + num2;
        double subtractionResult = num1 - num2;
        double subtractionResult2 = num2 - num1;
        double multiplicationResult = num1 * num2;
        double divisionResult = num1 / num2;
        double remainderResult = num1 % num2;  // % -- > modules

        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num2 + " - " + num1 + " = " + subtractionResult2);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);

        System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        System.out.println(num1 + " % " + num2 + " = " + remainderResult);


        System.out.println("---------------------------");

        int num3 = 7;
        int num4 = 5;

        int additionResult2 = num3 + num4;
        int subtractionResult3 = num3 - num4;
        int subtractionResult4 = num4 - num3;
        int multiplicationResult2 = num3 * num4;
        int divisionResult2 = num3 / num4;
        int remainderResult2 = num3 % num4;

        System.out.println(num3 + " + " + num4 + " = " + additionResult2);
        System.out.println(num3 + " - " + num4 + " = " + subtractionResult3);
        System.out.println(num4 + " - " + num3 + " = " + subtractionResult4);
        System.out.println(num3 + " * " + num4 + " = " + multiplicationResult2);

        System.out.println(num3 + " / " + num4 + " = " + divisionResult2);
        System.out.println(num3 + " % " + num4 + " = " + remainderResult2);


        System.out.println("---------------------------");
        System.out.println(3.2 + 1); // double + int --- > CASTING will always pick the bigger --> 4.2

        int a = 3;
        double d = 4;  // 4.0
        double result = a + d; // int + double--- > double
        System.out.println(result); // 7.0


        int a2 = 3;
        double d2 = 4;  // 4.0
        //int result2 = (int)a2 + d2; // int + double--- > double --> cast it into int so result2 can hold it.
        int result2 = (int)(a2 + d2); // int + double--- > double --> cast total into int so result2 can hold it.
        System.out.println(result2); // 7.0


        short s = 10;
        int i = 20;
        System.out.println(s * i); // short * int -- > int

        double d3 = 10.5;
        float f = 20.5f;
        float result3 = (float)(d3 - f);  // double - float ---- > double
        System.out.println(result3);


        System.out.println("-------------------");
        byte b5 = 2;
        short s5 = 3;
        short res = (short)(b5 + s5); // byte and short --- >  int
        System.out.println(res);

        System.out.println(b5 + s5); // byte + short --- > short --- >  int


        /*
            byte and short --- > int
            byte and byte ---- > int
            short and short -- > int


            byte and int ----- > int
            short and int ---- > int
            int and int ------ > int

            float and int ---- > float;
            float and double -- > double
         */



    }
}
