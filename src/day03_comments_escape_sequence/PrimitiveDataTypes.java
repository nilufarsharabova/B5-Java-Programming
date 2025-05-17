package day03_comments_escape_sequence;

public class PrimitiveDataTypes {

    public static void main (String[] args){
        // I want to have a variable that holds age of the person - with two statements
        int age;    // I DECLARED(created) a variable(container) called "age" which will hold whole numbers (int)
        age = 20;   // I assigned a value 20 to the variable "age"

        int miles = 200; // I DECLARED a variable called "miles" and assigned whole number 200 to it.

        age = 100;
        System.out.println( age );
        System.out.println( "age" );





        // The following code just joke. We do not do illegal things. It is just to explain the flow
        System.out.println("I bought new car with 0 miles");
        int carMiles = 0;
        System.out.println(carMiles);
        System.out.println("I drove 50 miles to ocean and came back");
        carMiles = 50;
        System.out.println(carMiles);
        System.out.println("I took my car to a special place to erase 25 miles. Doing illegal things.");
        carMiles = 25;
        System.out.println(carMiles);


        System.out.println("---------------------------------------------------------------------------");
        int year = 2025; // I DECLARED a variable called "year" with data int(whole number) and assigned a value 2025 to it.
        System.out.println(year);  // DYNAMICALLY, I am using data with variables in Dynamic way
        System.out.println("year"); // Here, we just print the DATA (Letters - String) directly
        System.out.println(2025);   // Here, we just print the DATA (numbers - int) directly which has NO RELATION with variable called "year"


        System.out.println("---------------------------------------------------------------------------");
        //byte age; // No matter what the data type is, we can NOT use the SAME variable name more one time in the SAME method.
        byte number = 0;
        System.out.println(number);

        number = -128;
        System.out.println(number);
        number = 127;
        System.out.println(number);

        //number = 128;
        //number = -129;
        System.out.println(number);


        short number2 = 200;
        System.out.println(number2);

        int number3 = 10;
        System.out.println(number3);


        long number4 = 12345678912l;
        System.out.println(number4);
        long number5 = 12345678912L;
        System.out.println(number5);



    }

}
