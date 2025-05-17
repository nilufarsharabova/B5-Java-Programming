package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {

        String storeName = "Costco";
        int numberOfTV = 100;


        System.out.println("In " + storeName + " we have " + numberOfTV + " TVs");
        System.out.println("Someone came and put 1 TV in cart and that person is still in the Store and in stock we have " + numberOfTV-- + " TV"); //
        // 10 mins later he paid
        System.out.println("Now in stock we have " + numberOfTV + " TV left");


        System.out.println("That same customer returned, and store actually pout i back in stock and in the stock we have " +  ++numberOfTV + " TV");


    }
}
