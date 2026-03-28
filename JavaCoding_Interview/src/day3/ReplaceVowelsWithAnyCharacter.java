package day3;

public class ReplaceVowelsWithAnyCharacter {
    public static void main(String[] args) {

        //Here we are replacing vowels with x
        String input = "Name";//Nxmx
        String finalInput = input.toLowerCase();//convert upper to lower
        StringBuilder builder = new StringBuilder();
        //Convert string to char array
        char inputArray[] = finalInput.toCharArray();

        //traverse
        for (char currentChar : inputArray) {

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                builder.append('x');
            } else {
                builder.append(currentChar);
            }

        }
        System.out.println("Output: " + builder.toString());


    }
}
