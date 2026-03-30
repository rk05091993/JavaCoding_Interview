package day5;

import java.util.Arrays;
import java.util.Collections;

public class SortarrayInBuiltMethod {
    public static void main(String[] args) {

        //Approach-1
/*
        int a[]={4,2,1,5,3};
        System.out.println("Before sorting array: "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting array: "+ Arrays.toString(a));
*/
        //Approach-2
   /*     int a[]={4,2,1,5,3};
        System.out.println("Before sorting array: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting array: "+ Arrays.toString(a));*/


        //Reverse Order(Descending order)
        Integer a[]={4,2,1,5,3};
        System.out.println("Before sorting array: "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        //Collections.reverseOrder() donot suppport primitive it support its wrapper class so we made int to Integer
        System.out.println("After sorting array: "+ Arrays.toString(a));
    }
}
