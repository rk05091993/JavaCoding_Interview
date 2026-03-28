package day3;

public class ReplaceVowelsWithAnyCharacter_2 {
    public static void main(String[] args) {

        //Here we are replacing vowels with x
        String input = "Name";//Nxmx
        // String finalInput=input.toLowerCase();//convert upper to lower
        StringBuilder builder = new StringBuilder();
        //Convert string to char array
        char inputArray[] = input.toCharArray();

        //traverse
        for (char currentChar : inputArray) {

            if (isVowel(currentChar)) {
                builder.append('x');
            } else {
                builder.append(currentChar);
            }

        }
        System.out.println("Output: " + builder.toString());


    }

    public static boolean isVowel(char currentChar) {

        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
            return true;
        } else {
            return false;
        }

    }
}
