package day04_variables;
/*
    Primitive Data Types
        WHOLE NUMBERS / INTEGER TYPE:       byte, short, int, long     - > if you use data direclty, Java takes it as "int" by default/automatically
        DECIMAL NUMBERS / FLOATING TYPE:    float, double               - > if you use data direclty, Java takes it as "double" by default/automatically

 */

public class FloatingNumbers {
    public static void main(String[] args) {

        // In Java we cannot store fraction directly.
        System.out.println(3/4); // in Math 3.4 = 0.75

        // To be able to store fractions / decimals we use FLOATING TYPE / DECIMAL numbers
        // Declared variable and assigned initial value.
        double price = 3.99;

        //float average = 0.29F;  // we put Uppercase F at the end
        float average = 0.29f;  // we put Uppercase f at the end


        System.out.println(price);
        System.out.println(average);


        System.out.println(0.19);


    }
}
