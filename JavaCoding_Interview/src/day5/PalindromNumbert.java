package day5;

import java.util.Scanner;

public class PalindromNumbert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();

        int org_num=num;

        //reverse the number
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }  //16461
        if(org_num==rev){
            System.out.println("The number is a palindrom");
        }
        else {
            System.out.println("The number is not a palindrom");
        }
    }
}
