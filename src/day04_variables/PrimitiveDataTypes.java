package day04_variables;
/*
    Primitive Data Types
        WHOLE NUMBERS / INTEGER TYPE:       byte, short, int, long     - > if you use data direclty, Java takes it as "int" by default
        DECIMAL NUMBERS / FLOATING TYPE:    float, double

 */



public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // If you know your container will hold WHOLE NUMBERS: byte, short, int, long
        // If you know your container will hold DECIMAL NUMBERS: float, double

        // Declaring variable --- > Datatype VariableName;
        byte age;
        //System.out.println(age); // at this line, since variable age does not have value, nothing will be printed. So, it is erroring
        //byte age = 10; // We canNOT declare the same varibale name in same method.
        //int age = 10; // Still We canNOT declare the same varibale name even if the data type is different in same method.
        age = 10;  // In this line, we have - assign initial value (first time giving value). We have initialized variable.
        System.out.println(age); // singe age variable have value in it, my code can print it out.

        System.out.println("age"); // Here we are printing the DATA itself directly - DATA is letters (String)
        System.out.println(10);  // Here we are printing the DATA itself directly - DATA is whole number (int)
        System.out.println("10");  // Here we are printing the DATA itself directly - DATA is letter (String)

        age = 20; // Here we REASSIGNED a nwe value which 20 to variable "age"
        System.out.println(age);

        //age = 200; // We CANNOT assign a data which is OUTSIDE OF RANGE that byte can hold


        System.out.println();
        // Declaring variable + assigned initial value  --- > Datatype VariableName = value/data;
        short year = 2025; //
        System.out.println(year); // short
        System.out.println(2025); // int


        // Declaring variable
        int addressNumber;
        // assigning value/data into variable called addressNumber
        addressNumber = 129482;
        System.out.println(addressNumber); // int
        System.out.println(129482); // int
        System.out.println(129434); // int
        System.out.println("129434"); // letters - String



        // Declaring variable
        long creditCardNumber;
        // assigning value / initializing variable
        //creditCardNumber = 1234567891234567l;  // Lowercase L at the end
        creditCardNumber = 1234567891234567L; //Uppercase L at the end

        System.out.println(4234567891234567L); // Since java take the data directly as "int" and since 4234567891234567 is outisde of the range that int can hold, we need to follow the syntax and add "L" or "l"


    }
}
