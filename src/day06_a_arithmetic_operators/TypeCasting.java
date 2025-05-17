package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b;      // IMPLICIT CASTING / WIDENING CASTING - AUTOMATICALLY: converting byte into int | int > byte
        System.out.println(b);
        System.out.println(i);
        System.out.println();

        int i2 = 100;
        //byte b2 = i2; // canNOT assign IMPLICITLY/AUTOMATICALLY/ DIRECTLY
        byte b2 = (byte)i2; // EXPLICIT CASTING / NARROWING CASTING - MANUALLY: converting int into byte | int > byte
        System.out.println(i2);
        System.out.println(b2);
        System.out.println();

        int i3 = 150;
        //byte b3 = i3;
        byte b3 = (byte) i3;
        System.out.println(i3);
        System.out.println(b3);   // Since i3 is holding the DATA/VALUE which is outside of the range that b3 can hold, there is DATA LOSS happens

        System.out.println("-------------------");


        int i4 = 500;
        long l4 = i4; // IMPLICIT CASTING / WIDENING CASTING - AUTOMATICALLY: converting int into long | long > int
        System.out.println(i4);
        System.out.println(l4);
        System.out.println();
        
        
        long l5 = 500; 
        // int i5 = l5;  // long > int ---> so explicit casting is needed
        int i5 = (int)l5; // EXPLICIT CASTING / NARROWING CASTING
        System.out.println(l5);
        System.out.println(i5);


        System.out.println("-------------------");
        int i6 = 50;
        double d6 = i6;  // IMPLICIT CASTING /WIDENING CASTING
        System.out.println(i6);
        System.out.println(d6);
        System.out.println();

        double d7 = 50.0;
        //int i7 = d7;
        int i7 = (int)d7; // EXPLICIT CASTING / NARROWING CASTING
        System.out.println(d7);
        System.out.println(i7);
        System.out.println();


        double d8 = 50.97;
        //int i8 = d8;
        int i8 = (int)d8; // EXPLICIT CASTING / NARROWING CASTING -  portion of the data will be lost
        System.out.println(d8);
        System.out.println(i8);

        System.out.println("-------------------");

        long l9 = 12;
        //int i9 = l9;
        int i9 = (int)l9; // long into int
        int i10 = (short)l9;  // #1 - long into short (EXPLICIT CASTING) | #2 - short into int (IMPLICIT CASTING)
        int i11 = (byte)l9;   // #1 - long into byte (EXPLICIT CASTING)  | #2 - byte into int (IMPLICIT CASTING)

        System.out.println(l9);
        System.out.println((byte)l9);
        System.out.println(i11);

        short s12 = 12;
        int i12 = s12;



    }
}
