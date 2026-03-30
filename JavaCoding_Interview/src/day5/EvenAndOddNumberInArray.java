package day5;

import java.util.Arrays;

public class EvenAndOddNumberInArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 8, 9, 12, 15};

        //for loop
  /*      System.out.println("Even numbers in array..................");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }}
            System.out.println("Odd numbers in array..................");
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.println(a[i]);
                }
            }*/

            //for each loop
        System.out.println("Even numbers in array..................");
        for (int evenValue : a) {
            if(evenValue%2==0){
                System.out.println(evenValue);
            }

        }

        System.out.println("Odd numbers in array..................");
        for (int oddValue : a) {
            if(oddValue%2!=0){
                System.out.println(oddValue);
            }
        }

        }
    }

