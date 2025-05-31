package day07_relational_operators;
/*
    create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many full slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main (String[] args){
        String typeOfPizza = "Cheese";
        int numOfSlices = 20;
        int numOfPeople = 6;

        // calculate how many full slices each person will get
        // 20 / 6 = 3
        int fullSliceForEachPerson = numOfSlices / numOfPeople;


        //Calculate how many slices are left over
        // 20 - ( 6 * 3) = 20 - 18 = 2
        int leftOverSlices1 = numOfSlices - (numOfPeople * fullSliceForEachPerson);

        // 20 % 6 = 2
        int leftOverSlices2 = numOfSlices % numOfPeople;

        String result = "We bought " + typeOfPizza + " pizza. It has " + numOfSlices + " slices and we are " + numOfPeople + " people. Each of us will get " + fullSliceForEachPerson + " full slices and there will be " + leftOverSlices2 + " slices left over.";

        System.out.println(result);


    }
}
