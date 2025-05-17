package day06_b_unary_operators;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int age = 30;
        System.out.println(age);    //30

        System.out.println(age++);  // POST increment
        // use - > print
        // update > age = age + 1 // age = 30 + 1; age = 31
        System.out.println(age);

        System.out.println(age++);  // POST increment
        // use - > print -- 31
        // update > age = age + 1 // age = 31 + 1; age = 32
        System.out.println(age);

        System.out.println("***");
        System.out.println(age++);
        // USE (32) > UPDATE (33)
        System.out.println(age++);
        // USE (33)> UPDATE (34)
        System.out.println(age);
        // USE (34)


        System.out.println();
        System.out.println(--age); //PRE
        // UPDATE (33) > USE(33)

        System.out.println(age--); // POST
        // USE (33) > UPDATE (32)
        System.out.println(age);


    }
}
