package day26_methods;

import my_util.*;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] nums = {23, 54, 65, 234, 754, -23, 453};
        //             0   1   2     3   4    5    6
        System.out.println( ArrayUtil.minNumInArray(nums) );
        System.out.println( ArrayUtil.maxNumInArray(nums) );

        System.out.println(ArrayUtil.minNumInArray(new int[]{23, 54, 643, 2345}));

        System.out.println("----------------------");
        String str = "loopcamp";
        //            01234567
        System.out.println(str.contains("k"));

        System.out.println( ArrayUtil.contains(nums, 65) );
        System.out.println( ArrayUtil.contains(nums, 55) );



        System.out.println("----------------------");
        System.out.println( str.indexOf("o") );
        System.out.println( str.indexOf("k") );

        System.out.println("----------------------");

        //{23, 54, 65, 234, 754, -23, 453};
        System.out.println( ArrayUtil.indexOf(nums, -23) );
    }
}