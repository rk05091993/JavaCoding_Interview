package day4;

import java.util.HashSet;

public class CheckStringIsPangram_2 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog ";
        boolean result=checkPangram(input);
        if(result==true){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }
    }

    private static boolean checkPangram(String input) {
        HashSet<Character> characterSet = new HashSet<Character>();//No duplicate value can be stored
        char inputChar[]=input.toLowerCase().toCharArray();
        for (char c : inputChar) {
            if(Character.isLetter(c)){ //isLetter() helps to check whether it is alphabets or not
                characterSet.add(c);//if true then it will add
            }

        }
        if(characterSet.size()==26){
            return true;
        }
        else {
            return false;
        }
    }
}
