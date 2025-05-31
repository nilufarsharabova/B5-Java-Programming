package day07_relational_operators;
/*
    1) ++, --
    2) - (making it negative)
    3) *, /, %,
    4) +, -
 */
public class OperatorPractice3 {
    public static void main(String[] args) {
        int t = 100; // 101 | 100 | 101 | 100

        int p = - ++t * t-- / t++ + --t;
        // p = _ 101 _ 101 _ 100 _ 100
        // p = -101 _ 101 _ 100 _ 100
        // p = -101 * 101 / 100 + 100
        // p = -10201 / 100 + 100
        // p = -10201 / 100 + 100
        // p = -102 + 100
        // p = -2


        System.out.println(t);
        System.out.println(p);


    }
}
