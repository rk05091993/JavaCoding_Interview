package day5;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");

        String  str=sc.next();
        //str.toLowerCase();
        String org_str=str;

        //reverse string
        String rev="";
        int len=str.length();
        for (int i=len-1; i>=0; i--) {
            rev=rev+str.charAt(i);
        }
      if(org_str.equals(rev)){
          System.out.println(str+" is Palindrom");

      }
      else{
          System.out.println(str+" is not Palindrom");
      }

    }
}
