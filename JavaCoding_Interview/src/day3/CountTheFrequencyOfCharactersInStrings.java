package day3;

import java.util.HashMap;

public class CountTheFrequencyOfCharactersInStrings {
    public static void main(String[] args) {
        String input = "turtle";

        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        //1)How to convert a string to a char array
        char inputArray[] = input.toCharArray();
        // System.out.println(value.length);

        //2) Traverse this char array
        for (char character : inputArray) {
            //System.out.println(character);
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
            //for value we have to check that in map that value is present or not so we use frequencyMap.getOrDefault(character,0)+1)
            //if we donot get character then return 0  if we get character then character value +1


        }
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + " " + frequencyMap.get(c));

        }

    }
}

