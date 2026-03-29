package day4;

import java.util.HashMap;

public class FrequencyOfSpecialCharacterInString {
    public static void main(String[] args) {
        String input="abs#@#!";//#-->2  ,@-->1
        HashMap<Character,Integer> frequency=new HashMap<Character,Integer>();//key and value
        char inputarray[]=input.toCharArray();//to traverse

        for (char c : inputarray) {
            if( !((c>='a' && c<='z') || (c >='A' && c<='Z') || (c >='0' && c <='9') || ( c==' '))){
                if(frequency.containsKey(c)){
                    frequency.put(c,frequency.get(c)+1);
                }
                else{ //it will execute if character is not present in Map
                    frequency.put(c,1);
                }
            }
        }
        System.out.println(frequency);



    }
}
