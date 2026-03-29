package day4;


import java.util.LinkedHashSet;

public class PrintUniqueCharactersFromString {
    public static void main(String[] args) {

        String input="abbacdaab";//abcd
        LinkedHashSet<Character> set=new LinkedHashSet<>(); //insertion order preserved
        StringBuilder sb=new StringBuilder();//modification
         char inputArray[]=input.toCharArray();//convert to char array

        for (char c : inputArray) {
            //System.out.println(c);
            if (set.add(c))
            {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
