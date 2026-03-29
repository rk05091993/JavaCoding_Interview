package day4;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String input="CII";//7
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);

        int result=0;
        int previousValue=0;
for(int i=input.length()-1;i>=0;i--){
    char currentChar=input.charAt(i);
    int currentvalue=romanMap.get(currentChar);
    if(currentvalue>=previousValue){
        result=result+currentvalue;
    }
    else{
        result=result-currentvalue;
    }
    previousValue=currentvalue;
}
        System.out.println("Integer format for"+input+": "+result);


    }
}
